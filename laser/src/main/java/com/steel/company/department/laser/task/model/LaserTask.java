package com.steel.company.department.laser.task.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public  class LaserTask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private LocalDateTime createdAt;
	
	@ManyToOne
	private Customer customer;
	
	private BigDecimal cuttingPrice;
	
	private BigDecimal materialPrice;
	
	private int departmentMargin;
	
	@ManyToOne
	private CuttingPlan cuttingPlan;
	
	private String description;
}