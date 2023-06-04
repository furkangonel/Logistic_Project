package com.afg.logistic.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoadWithTypeDto {
	private int loadId;
	private String loadName;
	private String typeName;
	
	
}
