package org.example.low_level_design.lld3.parking_lot19102024.repositories;


import org.example.low_level_design.lld3.parking_lot19102024.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
   private Map<Long, Vehicle> vehicleMap = new HashMap<> ();
   private Map<String, Vehicle> vehicleRegMap = new HashMap<> ();
   private Long previousId = 0L;

   public Vehicle save (Vehicle vehicle) {
	  if (vehicle.getId () == null){
		 vehicle.setId (++previousId);
	  }
	  vehicleMap.put (vehicle.getId (), vehicle);
	  return vehicle;
   }

   public Vehicle findVehicleByRegNO (String regNo) {
	  if (vehicleRegMap.containsKey (regNo)) {
		 return vehicleRegMap.get (regNo);
	  }
	  return  null;
   }

   public Vehicle findVehicleById (Long id) {

	  if (vehicleMap.containsKey (id)) {
		 return vehicleMap.get (id);
	  }
	  return null;
   }


}
