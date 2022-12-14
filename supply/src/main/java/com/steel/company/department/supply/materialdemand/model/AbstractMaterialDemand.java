package com.steel.company.department.supply.materialdemand.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.steel.company.department.supply.storage.model.AbstractStorageItem;
import com.steel.company.department.supply.wiki.measurement.MeasurementUnit;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class AbstractMaterialDemand <H extends AbstractStorageItem> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private H storageItem;
	
	private BigDecimal quantity;
	
	private MeasurementUnit unit;
	
	private LocalDateTime createdAt;
}
