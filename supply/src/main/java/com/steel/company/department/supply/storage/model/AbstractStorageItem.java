package com.steel.company.department.supply.storage.model;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.steel.company.department.supply.wiki.measurement.MeasurementUnit;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class AbstractStorageItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private BigDecimal stockQuantity;
	
	private BigDecimal minStockQuantity;
	
	private MeasurementUnit unit;
	
	private BigDecimal avgPrice;
}
