package org.example.low_level_design.lld2.strategy.test.google_map;

import org.example.low_level_design.lld2.strategy.test.google_map.factories.PathCalculatorFactory;
import org.example.low_level_design.lld2.strategy.test.google_map.strategies.PathCalculator;

public class Client {
   public static void main (String[] args) {
	  demoStrategy ();
   }

   private static void demoStrategy () {
	  PathMode mode = PathMode.CAR;
	  String source = "Kannur";
	  String destination = "Kochi";

	  PathCalculator carPathCalculator = PathCalculatorFactory.pathCalculatorFactory (mode);
	  GoogleMap googleMap1 = new GoogleMap (carPathCalculator);
	  googleMap1.findPath (source, destination);

	  PathCalculator bikePathcalculator = PathCalculatorFactory.pathCalculatorFactory (PathMode.BIKE);
	  GoogleMap googleMap2 = new GoogleMap (bikePathcalculator);
	  googleMap2.findPath (source, destination);

	  System.out.println ("debug");

   }
}
