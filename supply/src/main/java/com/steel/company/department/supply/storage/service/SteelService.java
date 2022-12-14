package com.steel.company.department.supply.storage.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SteelService {

	public BigDecimal getAvgPriceForItem() {
		return BigDecimal.valueOf(4.11);
	}

	public Map<Long, BigDecimal> getPricesForList(List<Long> ids) {
		Map<Long, BigDecimal>prices=new HashMap<>();
		prices.put(1L, BigDecimal.valueOf(2.55));
		prices.put(2L, BigDecimal.valueOf(3.55));
		prices.put(3L, BigDecimal.valueOf(4.55));
		return prices;
	}
}
