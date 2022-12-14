package com.steel.company.department.supply.materialdemand.model.transfer.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.steel.company.department.supply.materialdemand.model.SteelSheetDemand;
import com.steel.company.department.supply.materialdemand.model.transfer.SteelSheetDemandTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SupplyObjectMapper {

	private ModelMapper mapper;

	public SteelSheetDemand mapSteelSheetDemandToToSteelSheetDemand(SteelSheetDemandTO steelSheetDemandDTO) {
		SteelSheetDemand result = mapper.map(steelSheetDemandDTO, SteelSheetDemand.class);
		return result;
	}
	
	public SteelSheetDemandTO mapSteelSheetDemandToSteelSheetDemandTO(SteelSheetDemand steelSheetDemand) {
		SteelSheetDemandTO result = mapper.map(steelSheetDemand, SteelSheetDemandTO.class);
		return result;
	}
}
