package com.steel.company.department.supply.wiki.measurement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Density {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private double densityValue;
	
	private WeightUnit weigthUnit;
	
	private LenghtUnit lengthUnit;
}
