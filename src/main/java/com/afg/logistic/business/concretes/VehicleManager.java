package com.afg.logistic.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afg.logistic.business.abstracts.VehicleService;
import com.afg.logistic.core.utilities.results.DataResult;
import com.afg.logistic.core.utilities.results.Result;
import com.afg.logistic.core.utilities.results.SuccessDataResult;
import com.afg.logistic.core.utilities.results.SuccessResult;
import com.afg.logistic.dataAccess.abstracts.VehicleRepository;
import com.afg.logistic.entities.concretes.Vehicle;



@Service
public class VehicleManager implements VehicleService {

	private VehicleRepository vehicleRepository;
	
	@Autowired
	public VehicleManager(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}

	
	@Override
	public DataResult<List<Vehicle>> getAll() {
	
		return new SuccessDataResult<List<Vehicle>>(this.vehicleRepository.findAll(), "Data listelendi");		
		
	}

	@Override
	public Result add(Vehicle vehicle) {
		this.vehicleRepository.save(vehicle);
		return new SuccessResult("Araç eklendi.");
		
	}

	

}
