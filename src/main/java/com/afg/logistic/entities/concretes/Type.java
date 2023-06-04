package com.afg.logistic.entities.concretes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="types")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "vehicles"})

public class Type {

	@Id
	@Column(name="type_id")
	private int typeId;
	
	@Column(name="type_name")
	private	String typeName;
	
	@Column(name="trailer")
	private String trailer;
	
	@Column(name="loading")
	private String loading;
	
	@OneToMany(mappedBy = "type")
	private List<Vehicle> vehicles;
	
	
}
