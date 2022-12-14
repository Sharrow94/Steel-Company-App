package com.steel.company.department.laser.task.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.steel.company.department.laser.feign.client.supply.SteelGradeTO;

import lombok.Data;

@Data
public class SteelDemandTO {

	private Long id;

	private SteelSheetTO steelSheet;

	private SteelGradeTO steelGrade;

	private BigDecimal quantity;

	private LocalDateTime createdAt;
}
