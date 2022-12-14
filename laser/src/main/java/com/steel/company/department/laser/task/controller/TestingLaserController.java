package com.steel.company.department.laser.task.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.steel.company.department.laser.feign.client.supply.SteelGradeTO;
import com.steel.company.department.laser.feign.client.supply.SupplyFeignClient;
import com.steel.company.department.laser.task.model.SteelDemandTO;
import com.steel.company.department.laser.task.model.SteelSheetTO;
import com.steel.company.department.laser.task.service.LaserTaskService;
import com.steel.company.department.laser.test.TestObjectProvider;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("laser")
public class TestingLaserController {

	private LaserTaskService laserTaskService;

	private TestObjectProvider objectProvider;

	private SupplyFeignClient supplyFeignClient;

	@GetMapping("/test/task")
	public void testLaserTask() {
		laserTaskService.createNewLaserTask(objectProvider.getLaserTask());
	}

	@GetMapping("/sayhellofromfeign")
	public String sayHelloFromSupplyDep() {
		return supplyFeignClient.getHelloFromSupply();
	}

	@Operation(description = "Get avg unit price for type of steel")
	@GetMapping("/getavgprice/{list}")
	public Map<Long, BigDecimal> getAvgPrice(@RequestParam("list") List<Long> ids) {
		return supplyFeignClient.checkSteelPrice(ids);
	}

	@GetMapping("/materialdemand")
	public void sendMaterialDemandToSupplyDepartment() {
		List<SteelDemandTO> steelDemandList = new ArrayList<>();

		SteelDemandTO demand1 = new SteelDemandTO();
		SteelSheetTO steelSheetSizeTO = new SteelSheetTO();
		steelSheetSizeTO.setId(5L);
		demand1.setSteelSheet(steelSheetSizeTO);
		SteelGradeTO steelGradeTO = new SteelGradeTO();
		steelGradeTO.setId(5L);
		demand1.setSteelGrade(steelGradeTO);
		demand1.setQuantity(BigDecimal.valueOf(5));
		demand1.setCreatedAt(LocalDateTime.now());

		steelDemandList.add(demand1);

		supplyFeignClient.sendMaterialDemandToSupplyDepartment(steelDemandList);
	}
}
