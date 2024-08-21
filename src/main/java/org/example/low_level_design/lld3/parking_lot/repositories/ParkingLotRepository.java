package org.example.low_level_design.lld3.parking_lot.repositories;

import org.example.low_level_design.lld3.parking_lot.models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
   private final Map<Long, ParkingLot> parkingLotMap = new TreeMap<> ();
   private Long previousId = 0L;

   public ParkingLot save (ParkingLot parkingLot) {
	  if (parkingLotMap.get (parkingLot.getId ()) == null) {
		 parkingLot.setId (++previousId);
	  }
	  parkingLotMap.put (parkingLot.getId (), parkingLot);
	  return parkingLot;
   }

   public ParkingLot findParkingLotById (Long id) {
	  return parkingLotMap.get (id);
   }
}
