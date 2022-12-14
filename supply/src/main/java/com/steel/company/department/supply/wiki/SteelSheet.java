package com.steel.company.department.supply.wiki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.steel.company.department.supply.wiki.measurement.Density;

import lombok.Data;

@Entity
@Data
public class SteelSheet {

	private static final String SEPARATOR = "x";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private Integer length;

	private Integer width;

	private Double thickness;

	@ManyToOne
	private Density density;

	public void createName() {
		setName(length + SEPARATOR + width + SEPARATOR + thickness);
	}
}
