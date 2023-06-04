package com.afg.logistic.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.afg.logistic.entities.concretes.Vehicle;
import com.afg.logistic.entities.dtos.LoadWithTypeDto;


public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{
		
	Vehicle getByLoadName(String loadName);
		
	Vehicle getByLoadNameAndType_TypeId(String loadName, int typeId);
	
	List<Vehicle> getByLoadNameOrType_TypeId(String loadName, int typeId);
	
	List<Vehicle> getByTypeIn(List<Integer> types);
	
	List<Vehicle> getByLoadNameContains(String loadName);
	
	List<Vehicle> getByLoadNameStartsWith(String loadName);
	
	@Query("From Vehicle where loadName=:loadName and type.typeId=:typeId")
	List<Vehicle> getByNameAndType(String loadName, int typeId);
	
	@Query("Select new com.afg.logistic.entities.dtos.LoadWithTypeDto(v.loadId, v.loadName, t.typeName) From Type t Inner Join t.vehicles v")
	List<LoadWithTypeDto> getLoadWithTypeDetails();
	
	
}
