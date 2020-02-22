package com.maestrosat.tut;

import java.math.BigDecimal;

public interface StockOptionEligible {
  void awardStockOptions(int number, BigDecimal price);
}
