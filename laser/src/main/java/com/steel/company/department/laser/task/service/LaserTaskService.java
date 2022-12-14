package com.steel.company.department.laser.task.service;

import org.springframework.stereotype.Service;

import com.steel.company.department.laser.feign.client.supply.SupplyFeignClient;
import com.steel.company.department.laser.task.model.LaserTask;

@Service
public class LaserTaskService {

	private SupplyFeignClient supplyFeignClient;

	public void createNewLaserTask(LaserTask laserTask) {
	}
}
