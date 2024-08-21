package org.example.low_level_design.lld3.parking_lot.repositories;

import org.example.low_level_design.lld3.parking_lot.models.ParkingFloor;

import java.util.Map;
import java.util.TreeMap;

public class ParkingFloorRepository {
   private Map<Long, ParkingFloor> parkingFloorMap = new TreeMap<> ();
   private Long previousId=0L;

   public ParkingFloor save (ParkingFloor parkingFloor) {
	  if (parkingFloorMap.get (parkingFloor.getId ()) == null) {
		 parkingFloor.setId (++previousId);
	  }
	  parkingFloorMap.put (parkingFloor.getId (), parkingFloor);
	  return parkingFloor;
   }

   public ParkingFloor findParkingFloorById (Long id) {
	  return parkingFloorMap.get (id);
   }
}
