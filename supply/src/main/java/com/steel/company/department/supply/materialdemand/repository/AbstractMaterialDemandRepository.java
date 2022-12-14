package com.steel.company.department.supply.materialdemand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steel.company.department.supply.materialdemand.model.AbstractMaterialDemand;

public interface AbstractMaterialDemandRepository<M extends AbstractMaterialDemand<?>> extends JpaRepository<M, Long> {
}
