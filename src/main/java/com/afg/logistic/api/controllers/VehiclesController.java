package com.afg.logistic.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afg.logistic.business.abstracts.VehicleService;
import com.afg.logistic.core.utilities.results.DataResult;
import com.afg.logistic.core.utilities.results.Result;
import com.afg.logistic.entities.concretes.Vehicle;
import com.afg.logistic.entities.dtos.LoadWithTypeDto;

@RestController
@RequestMapping("/api/vehicles")

@CrossOrigin
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
	
	@GetMapping("/getByLoadName")
	public DataResult<Vehicle> getByLoadName(@RequestParam String loadName) {
		return this.vehicleService.getByLoadName(loadName);
	}
	
	@GetMapping("/getByLoadNameAndTypeId")
	public DataResult<Vehicle> 
	getByLoadNameAndTypeId(@RequestParam String loadName,@RequestParam int typeId) {
		
		return this.vehicleService.getByLoadNameAndTypeId(loadName, typeId);
	}
	
	@GetMapping("/getByLoadNameContains")
	public DataResult<List<Vehicle>> getByLoadNameContains(@RequestParam String loadName) {
		 
		return this.vehicleService.getByLoadNameContains(loadName);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<Vehicle>> getAll(int pageNo, int pageSize) {
		
		return this.vehicleService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Vehicle>> getAllSorted() {
		return this.vehicleService.getAllSorted();
		}
	
	@GetMapping("/getLoadWithTypeDetails")
	public DataResult<List<LoadWithTypeDto>> getLoadWithTypeDetails() {
		return this.vehicleService.getLoadWithTypeDetails();
	} 
	
}
