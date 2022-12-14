package com.steel.company.department.supply.storage.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.steel.company.department.supply.wiki.SteelGrade;
import com.steel.company.department.supply.wiki.SteelSheet;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SteelStorage extends AbstractStorageItem {

	@ManyToOne
	private SteelGrade steelGrade;

	@ManyToOne
	private SteelSheet steelSheetSize;
}
