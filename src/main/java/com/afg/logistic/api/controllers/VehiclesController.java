package com.afg.logistic.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afg.logistic.business.abstracts.VehicleService;
import com.afg.logistic.core.utilities.results.DataResult;
import com.afg.logistic.core.utilities.results.Result;
import com.afg.logistic.entities.concretes.Vehicle;

@RestController
@RequestMapping("/api/vehicles")


public class VehiclesController {
	
	private VehicleService vehicleService;
	
	@Autowired
	public VehiclesController(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	}

	@GetMapping("/getall")
	public DataResult<List<Vehicle>> getAll() {
		return this.vehicleService.getAll();
	} 
	
	@PostMapping("/add")
	public Result add(@RequestBody Vehicle vehicle) {
		return this.vehicleService.add(vehicle);
	}
	
}
