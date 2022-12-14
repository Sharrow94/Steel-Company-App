package com.steel.company.department.supply.storageoperation;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.steel.company.department.supply.wiki.SteelSheet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StorageOperationSteel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private SteelSheet sheetSize;
}
