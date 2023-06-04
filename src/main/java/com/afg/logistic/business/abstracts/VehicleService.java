package com.afg.logistic.business.abstracts;

import java.util.List;
 
import com.afg.logistic.core.utilities.results.DataResult;
import com.afg.logistic.core.utilities.results.Result;
import com.afg.logistic.entities.concretes.Vehicle;
import com.afg.logistic.entities.dtos.LoadWithTypeDto;

public interface VehicleService {
	
	DataResult<List<Vehicle>> getAll();
	DataResult<List<Vehicle>> getAllSorted();
	DataResult<List<Vehicle>> getAll(int pageNo,int pageSize);
	Result add(Vehicle vehicle);
	   
	
	DataResult<Vehicle> getByLoadName(String loadName);
	
	DataResult<Vehicle> getByLoadNameAndTypeId(String loadName, int typeId);
	
	DataResult<List<Vehicle>> getByLoadNameOrTypeId(String loadName, int typeId);
	
	DataResult<List<Vehicle>> getByTypeIdIn(List<Integer> types);
	
	DataResult<List<Vehicle>> getByLoadNameContains(String loadName);
	
	DataResult<List<Vehicle>> getByLoadNameStartsWith(String loadName);
	
	DataResult<List<Vehicle>> getByNameAndType(String loadName, int typeId);
	
	DataResult<List<LoadWithTypeDto>> getLoadWithTypeDetails();
	
}
