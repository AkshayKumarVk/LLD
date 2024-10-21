package org.example.low_level_design.lld3.parking_lot19102024.services.factories;

import org.example.low_level_design.lld3.parking_lot19102024.models.SpotAssignmentStrategyType;
import org.example.low_level_design.lld3.parking_lot19102024.services.strategies.spotAssignmentStrategy.*;

public class SpotAssignmentStrategyFactory {
   public static SpotAssignmentStrategy getSpotAssignStrategy (SpotAssignmentStrategyType type) {

	  return switch (type) {
		 case NEAREST -> new NearestSpotAssignmentStrategy ();
		 case RANDOM -> new RandomSpotAssignmentStrategy ();
		 case FARTHEST -> new FarthestSpotAssignmentStrategy ();
		 case CHEAPEST -> new CheapestSpotAssignStrategy ();
	  };
   }
}
