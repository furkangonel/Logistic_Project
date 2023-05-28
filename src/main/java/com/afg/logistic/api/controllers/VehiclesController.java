package com.afg.logistic.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afg.logistic.business.abstracts.VehicleService;
import com.afg.logistic.entities.concretes.Vehicle;

@RestController
@RequestMapping("/api/products")
public class VehiclesController {
	
	private VehicleService vehicleService;
	
	@Autowired
	public VehiclesController(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	}

	@GetMapping("/getall")
	public List<Vehicle> getAll() {
		return this.vehicleService.getAll();
		
	}
}
