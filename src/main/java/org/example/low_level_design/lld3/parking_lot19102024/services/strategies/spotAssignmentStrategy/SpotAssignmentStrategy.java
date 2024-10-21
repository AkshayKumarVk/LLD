package org.example.low_level_design.lld3.parking_lot19102024.services.strategies.spotAssignmentStrategy;

import org.example.low_level_design.lld3.parking_lot19102024.models.Gate;
import org.example.low_level_design.lld3.parking_lot19102024.models.ParkingSpot;
import org.example.low_level_design.lld3.parking_lot19102024.models.SpotAssignmentStrategyType;
import org.example.low_level_design.lld3.parking_lot19102024.models.VehicleType;

public interface SpotAssignmentStrategy {
   public ParkingSpot assignSpot (VehicleType vehicleType);
}
