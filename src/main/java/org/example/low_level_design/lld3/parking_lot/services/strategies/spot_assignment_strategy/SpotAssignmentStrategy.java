package org.example.low_level_design.lld3.parking_lot.services.strategies.spot_assignment_strategy;

import org.example.low_level_design.lld3.parking_lot.models.ParkingSpot;
import org.example.low_level_design.lld3.parking_lot.models.VehicleType;

public interface SpotAssignmentStrategy {
   ParkingSpot assignSpot (VehicleType vehicleType);
}