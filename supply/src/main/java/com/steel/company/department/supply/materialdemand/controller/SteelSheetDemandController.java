package com.steel.company.department.supply.materialdemand.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steel.company.department.supply.materialdemand.model.SteelSheetDemand;
import com.steel.company.department.supply.materialdemand.model.transfer.SteelSheetDemandTO;
import com.steel.company.department.supply.materialdemand.service.SteelSheetDemandService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("materialdemand/steel")
public class SteelSheetDemandController {

	private SteelSheetDemandService service;

	@GetMapping("/all")
	public List<SteelSheetDemand> getAll() {
		return service.findAll();
	}

	@PostMapping("/create/list")
	public void createMaterialDemands(@RequestBody List<SteelSheetDemandTO> demands) {
		demands.stream().forEach(service::createSteelDemand);
	}
}
