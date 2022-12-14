package com.steel.company.department.supply.materialdemand.model.transfer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class SteelSheetDemandTO implements Serializable {

	private static final long serialVersionUID = -1232092271907040105L;

	private Long id;

	private SteelSheetTO steelSheet;

	private SteelGradeTO steelGrade;

	private BigDecimal quantity;

	private LocalDateTime createdAt;
}
