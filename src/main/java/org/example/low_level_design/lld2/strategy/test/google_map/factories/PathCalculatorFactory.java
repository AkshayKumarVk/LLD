package org.example.low_level_design.lld2.strategy.test.google_map.factories;

import org.example.low_level_design.lld2.strategy.test.google_map.PathMode;
import org.example.low_level_design.lld2.strategy.test.google_map.strategies.BikePathCalculator;
import org.example.low_level_design.lld2.strategy.test.google_map.strategies.CarPathCalculator;
import org.example.low_level_design.lld2.strategy.test.google_map.strategies.PathCalculator;
import org.example.low_level_design.lld2.strategy.test.google_map.strategies.WalkPathCalculator;

public class PathCalculatorFactory {

   public static PathCalculator pathCalculatorFactory (PathMode mode) {
	  return switch (mode){
		 case BIKE -> new BikePathCalculator ();
		 case CAR -> new CarPathCalculator ();
		 case WALK -> new WalkPathCalculator ();
		 default -> null;
	  };
   }
}
