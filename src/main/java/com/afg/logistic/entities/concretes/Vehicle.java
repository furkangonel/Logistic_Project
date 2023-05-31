package com.afg.logistic.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="loads")
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="load_id")
		private int loadId;
		
		@Column(name="load_name")
		private String loadName;
		
		@Column(name="load_weight")
		private double loadWeight;
		
		@Column(name="first_point")
		private String firstPoint;
		
		@Column(name="end_point")
		private String endPoint;
		
		@Column(name="price")
		private double price;
		
		@ManyToOne()
		@JoinColumn(name="type_id")
		private Type type;
		
}
