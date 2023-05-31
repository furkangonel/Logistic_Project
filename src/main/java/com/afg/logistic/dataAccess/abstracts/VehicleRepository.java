package com.afg.logistic.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.afg.logistic.entities.concretes.Vehicle;


public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{
		
	Vehicle getByLoadName(String loadName);
		
	Vehicle getByLoadNameAndCategoryId(String loadName, int typeId);
	
	List<Vehicle> getByLoadNameOrTypeId(String loadName, int typeId);
	
	List<Vehicle> getByTypeIdIn(List<Integer> types);
	
	List<Vehicle> getByLoadNameContains(String loadName);
	
	List<Vehicle> getByLoadNameStartsWith(String loadName);
	
	@Query("From Vehicle where loadName=:loadName and typeId=:typeId")
	List<Vehicle> getByNameAndType(String loadName, int typeId);
	
	
}
