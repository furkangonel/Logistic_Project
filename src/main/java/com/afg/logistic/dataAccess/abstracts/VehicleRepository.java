package com.afg.logistic.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afg.logistic.entities.concretes.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
