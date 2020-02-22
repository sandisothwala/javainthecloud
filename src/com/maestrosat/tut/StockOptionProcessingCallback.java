package com.maestrosat.tut;

/**
 * Functional interface - used to process Stock Options
 * 
 * @author sperry
 *
 */
public interface StockOptionProcessingCallback {
  void process(StockOptionEligible stockOptionEligible);
}
