package com.steel.company.department.supply.materialdemand.service;

import java.util.List;

import com.steel.company.department.supply.materialdemand.model.AbstractMaterialDemand;
import com.steel.company.department.supply.materialdemand.repository.AbstractMaterialDemandRepository;

public abstract class AbstractMaterialDemandService<M extends AbstractMaterialDemand<?>, R extends AbstractMaterialDemandRepository<M>> {

	private R repository;

	public AbstractMaterialDemandService(R repository) {
		this.repository = repository;
	}

	public abstract M getItemById(Long id);

	public abstract List<M> findAll();

	public R getRepository() {
		return repository;
	}
}
