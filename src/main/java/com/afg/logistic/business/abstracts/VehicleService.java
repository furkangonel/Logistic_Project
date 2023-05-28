package com.afg.logistic.business.abstracts;

import java.util.List;

import com.afg.logistic.entities.concretes.Vehicle;

public interface VehicleService {
	List<Vehicle> getAll();
}
