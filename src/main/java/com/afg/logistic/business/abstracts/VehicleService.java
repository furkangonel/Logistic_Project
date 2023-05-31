package com.afg.logistic.business.abstracts;

import java.util.List;

import com.afg.logistic.core.utilities.results.DataResult;
import com.afg.logistic.core.utilities.results.Result;
import com.afg.logistic.entities.concretes.Vehicle;

public interface VehicleService {
	
	DataResult<List<Vehicle>> getAll();
	Result add(Vehicle vehicle);
	   
}
