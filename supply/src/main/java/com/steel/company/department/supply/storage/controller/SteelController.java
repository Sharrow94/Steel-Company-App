package com.steel.company.department.supply.storage.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.steel.company.department.supply.storage.service.SteelService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("storage")
@AllArgsConstructor
public class SteelController {

	private SteelService steelService;

	@GetMapping("/steel/avgprice")
	public BigDecimal getAvgPriceForSteel() {
		return steelService.getAvgPriceForItem();
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Invoke method from Supply Dep in other microservice");
		return "Hello";
	}
	
	@GetMapping("/storage/steel/stockquantity/list/{list}")
	public Map<Long,BigDecimal> checkSteelPrice(@RequestParam("list")List<Long>ids){
		return steelService.getPricesForList(ids);
		
	};
}
