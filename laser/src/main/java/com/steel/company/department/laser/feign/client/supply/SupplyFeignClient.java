package com.steel.company.department.laser.feign.client.supply;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.steel.company.department.laser.task.model.SteelDemandTO;

@FeignClient("api-gateway/department-supply")
public interface SupplyFeignClient {

	@GetMapping("/storage/storage/steel/stockquantity/list/{list}")
	public Map<Long,BigDecimal> checkSteelPrice(@RequestParam("list")List<Long>ids);
	
	@GetMapping("/storage/hello")
	public String getHelloFromSupply();
	
	@GetMapping("/storage/steel/steelgrade/all")
	public List<SteelGradeTO>getAllSteelGrade();

	@PostMapping("/materialdemand/steel/create/list")
	public void sendMaterialDemandToSupplyDepartment(List<SteelDemandTO> steelDemands);
}
