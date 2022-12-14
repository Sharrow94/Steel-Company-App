package com.steel.company.department.supply.wiki;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class SteelGrade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String letterNumerical_PN_EN_10027_1;
	
	private String numercial_PN_EN_10027_2;
	
	private String DIN;
}
