package com.afg.logistic.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afg.logistic.business.abstracts.VehicleService;
import com.afg.logistic.dataAccess.abstracts.VehicleRepository;
import com.afg.logistic.entities.concretes.Vehicle;

@Service
public class VehicleManager implements VehicleService {

	private VehicleRepository vehicleRepository;
	
	@Autowired
	public VehicleManager(VehicleRepository vehicleRepository) {
		super();
	}

	@Override
	public List<Vehicle> getAll() {
	
		return this.vehicleRepository.findAll();
		
	}

	

}
