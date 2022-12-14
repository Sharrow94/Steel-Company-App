package com.steel.company.department.supply.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steel.company.department.supply.storage.model.SteelStorage;

public interface SteelStorageRepository extends JpaRepository<SteelStorage, Long> {
}
