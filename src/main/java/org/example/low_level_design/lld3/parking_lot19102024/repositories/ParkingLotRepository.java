package org.example.low_level_design.lld3.parking_lot19102024.repositories;

import org.example.low_level_design.lld3.parking_lot19102024.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
   private Map<Long, ParkingLot> parkingLotMap = new HashMap<> ();
   private Map<Long, ParkingLot> gateParkingLotMap = new HashMap<> ();
   private Long previousId = 0L;

   public ParkingLot save (ParkingLot parkingLot) {
	  if (parkingLot.getId () == null) {
		 parkingLot.setId (++previousId);
	  }

	  parkingLotMap.put (parkingLot.getId (), parkingLot);
	  return parkingLot;
   }

   public ParkingLot findParkingLotById (Long id) {
	  return parkingLotMap.get (id);
   }

   public ParkingLot findParkingLotByGateId (Long gateId) {
	  return gateParkingLotMap.get (gateId);
   }
}
