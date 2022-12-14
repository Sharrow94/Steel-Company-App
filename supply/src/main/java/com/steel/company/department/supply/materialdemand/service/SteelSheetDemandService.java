package com.steel.company.department.supply.materialdemand.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steel.company.department.supply.materialdemand.model.SteelSheetDemand;
import com.steel.company.department.supply.materialdemand.model.transfer.SteelSheetDemandTO;
import com.steel.company.department.supply.materialdemand.model.transfer.mapper.SupplyObjectMapper;
import com.steel.company.department.supply.materialdemand.repository.SteelSheetDemandRepository;

@Service
public class SteelSheetDemandService
		extends AbstractMaterialDemandService<SteelSheetDemand, SteelSheetDemandRepository> {

	private SupplyObjectMapper mapper;

	public SteelSheetDemandService(SteelSheetDemandRepository repository, SupplyObjectMapper mapper) {
		super(repository);
		this.mapper = mapper;
	}

	@Override
	public SteelSheetDemand getItemById(Long id) {
		return new SteelSheetDemand();
	}

	@Override
	public List<SteelSheetDemand> findAll() {
		return getRepository().findAll();
	}

	public void createSteelDemand(SteelSheetDemandTO demand) {
		SteelSheetDemand entity = mapper.mapSteelSheetDemandToToSteelSheetDemand(demand);
		getRepository().save(entity);
	}
}
