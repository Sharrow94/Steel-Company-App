package com.steel.company.department.laser.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.steel.company.department.laser.task.model.LaserTask;

@Repository
public interface LaserTaskRepository extends JpaRepository<LaserTask, Long>{

}
