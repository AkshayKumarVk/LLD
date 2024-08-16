package org.example.low_level_design.lld2.strategy.test.google_map.strategies;

public class CarPathCalculator implements PathCalculator {
   @Override
   public void findPath (String source, String destination) {
	  System.out.println ("Finding Car path from " + source + " to " + destination);
   }
}
