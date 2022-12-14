package com.steel.company.department.laser.test;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.steel.company.department.laser.task.model.Customer;
import com.steel.company.department.laser.task.model.CuttingPlan;
import com.steel.company.department.laser.task.model.Drawing;
import com.steel.company.department.laser.task.model.LaserTask;

@Component
public class TestObjectProvider {

	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setId(1L);
		customer.setName("Maciej");
		customer.setSurname("Roszyk");
		customer.setEmail("etim@o2.pl");
		customer.setPhoneNumber("600-400-500");
		return customer;
	}

	public CuttingPlan getCuttingPlan() {
		CuttingPlan cuttingPlan = new CuttingPlan();
		cuttingPlan.setCreatedAt(LocalDateTime.now());
		cuttingPlan.setDrawings(
				Arrays.asList(getDraw("drawing1.dwg", 1L), getDraw("drawing2.dwg", 2L), getDraw("drawing3.dwg", 3L)));
		return cuttingPlan;
	}

	public LaserTask getLaserTask() {
		LaserTask laserTask = new LaserTask();
		laserTask.setId(1L);
		laserTask.setCreatedAt(LocalDateTime.now());
		laserTask.setCuttingPlan(getCuttingPlan());
		laserTask.setCuttingPrice(null);
		return laserTask;
	}

	public Drawing getDraw(String name, Long id) {
		Drawing draw = new Drawing();
		draw.setId(id);
		draw.setName(name);
		return draw;
	}
}
