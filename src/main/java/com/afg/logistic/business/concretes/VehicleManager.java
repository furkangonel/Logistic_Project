package com.afg.logistic.business.concretes;


import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.afg.logistic.business.abstracts.VehicleService;
import com.afg.logistic.core.utilities.results.DataResult;
import com.afg.logistic.core.utilities.results.Result;
import com.afg.logistic.core.utilities.results.SuccessDataResult;
import com.afg.logistic.core.utilities.results.SuccessResult;
import com.afg.logistic.dataAccess.abstracts.VehicleRepository;
import com.afg.logistic.entities.concretes.Vehicle;
import com.afg.logistic.entities.dtos.LoadWithTypeDto;


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
	
		return new SuccessDataResult<List<Vehicle>>
		(this.vehicleRepository.findAll(), "Data listelendi");		
	}

	@Override
	public Result add(Vehicle vehicle) {
		this.vehicleRepository.save(vehicle);
		return new SuccessResult("Araç eklendi.");
		
	}


	@Override
	public DataResult<Vehicle> getByLoadName(String loadName) {
		
		return new SuccessDataResult<Vehicle>
		(this.vehicleRepository.getByLoadName(loadName), "Data listelendi");
	}

	@Override
	public DataResult<Vehicle> getByLoadNameAndTypeId(String loadName, int typeId) {
		
		return new SuccessDataResult<Vehicle>
		(this.vehicleRepository.getByLoadNameAndType_TypeId(loadName, typeId), "Data listelendi.");
	}


	@Override
	public DataResult<List<Vehicle>> getByLoadNameOrTypeId(String loadName, int typeId) {
		
		return new SuccessDataResult<List<Vehicle>>
		(this.vehicleRepository.getByLoadNameOrType_TypeId(loadName, typeId), "Data listelendi.");
	}


	@Override
	public DataResult<List<Vehicle>> getByTypeIdIn(List<Integer> types) {
		
		return new SuccessDataResult<List<Vehicle>>
		(this.vehicleRepository.getByTypeIn(types), "Data listelendi.");
	}


	@Override
	public DataResult<List<Vehicle>> getByLoadNameContains(String loadName) {
		
		return new SuccessDataResult<List<Vehicle>>
		(this.vehicleRepository.getByLoadNameContains(loadName), "Data listelendi.");
		
	}


	@Override
	public DataResult<List<Vehicle>> getByLoadNameStartsWith(String loadName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataResult<List<Vehicle>> getByNameAndType(String loadName, int typeId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataResult<List<Vehicle>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		
		return new SuccessDataResult<List<Vehicle>>
		(this.vehicleRepository.findAll(pageable).getContent());
	}


	@Override
	public DataResult<List<Vehicle>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "loadName");
		return new SuccessDataResult<List<Vehicle>>
		(this.vehicleRepository.findAll(sort), "Başarılı");
	}


	@Override
	public DataResult<List<LoadWithTypeDto>> getLoadWithTypeDetails() {

		return new SuccessDataResult<List<LoadWithTypeDto>>
		(this.vehicleRepository.getLoadWithTypeDetails(), "Data Lİstelendi");
	}

	

}
