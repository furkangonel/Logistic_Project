package com.afg.logistic.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="loads")
public class Vehicle {
		
		@Id
		@GeneratedValue	
		@Column(name="load_id")
		private int loadId;
		
		@Column(name="load_name")
		private String loadName;
		
		@Column(name="load_type")
		private String loadType;
		
		@Column(name="load_weight")
		private double loadWeight;
		
		@Column(name="first_point")
		private String firstPoint;
		
		@Column(name="end_point")
		private String endPoint;
		
		@Column(name="distance")
		private double distance;
		
		@Column(name="price")
		private double price;
		
		@Column(name="trailer_type")
		private String trailer_type;
		
}
