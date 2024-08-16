package org.example.low_level_design.lld2.strategy.test.google_map;

import org.example.low_level_design.lld2.strategy.test.google_map.strategies.PathCalculator;

public class GoogleMap {

   private PathCalculator pathCalculator;

   public GoogleMap(PathCalculator pathCalculator) {
	  this.pathCalculator=pathCalculator;
   }

   public void findPath (String source, String destination) {
	  pathCalculator.findPath (source, destination);
   }
}
