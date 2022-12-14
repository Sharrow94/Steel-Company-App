package com.steel.company.department.supply.storageoperation;

import java.math.BigDecimal;

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
public abstract class  StorageOperation<H extends AbstractStorageItem>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal quantity;
	
	private MeasurementUnit unit;
	
	private BigDecimal unitPrice;
	
	@ManyToOne
	private H item;
}
