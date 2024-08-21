package org.example.low_level_design.lld3.parking_lot.services.factories;

import org.example.low_level_design.lld3.parking_lot.models.SpotAssignmentStrategyType;
import org.example.low_level_design.lld3.parking_lot.services.strategies.spot_assignment_strategy.NearestSpotAssignmentStrategy;
import org.example.low_level_design.lld3.parking_lot.services.strategies.spot_assignment_strategy.RandomSpotAssignmentStrategy;
import org.example.low_level_design.lld3.parking_lot.services.strategies.spot_assignment_strategy.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
   public static SpotAssignmentStrategy getSpotAssignmentStrategy (SpotAssignmentStrategyType spotAssignmentStrategyType) {
	  switch (spotAssignmentStrategyType) {
		 case RANDOM :
			return  new RandomSpotAssignmentStrategy ();
		 case NEAREST:
			return  new NearestSpotAssignmentStrategy ();
		 default:
			return null;
	  }
   }
}
