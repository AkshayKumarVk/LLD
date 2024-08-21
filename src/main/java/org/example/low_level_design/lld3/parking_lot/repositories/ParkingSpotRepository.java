package org.example.low_level_design.lld3.parking_lot.repositories;

import org.example.low_level_design.lld3.parking_lot.models.ParkingFloor;
import org.example.low_level_design.lld3.parking_lot.models.ParkingSpot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingSpotRepository {
   private final Map<Long, ParkingSpot> parkingSpotMap = new TreeMap<> ();
   private Long previousId = 0L;

   public ParkingSpot save (ParkingSpot parkingSpot) {
	  if (parkingSpotMap.get (parkingSpot.getId ()) == null) {
		 parkingSpot.setId (++previousId);
	  }
	  parkingSpotMap.put (parkingSpot.getId (), parkingSpot);
	  return parkingSpot;
   }

   public ParkingSpot findParkingSpotById (Long id) {
	  return parkingSpotMap.get (id);
   }
}
