package org.example.low_level_design.lld3.parking_lot.repositories;

import org.example.low_level_design.lld3.parking_lot.models.Vehicle;

import java.util.Map;
import java.util.TreeMap;

public class VehicleRepository {
   private Map<Long, Vehicle> vehicleMap = new TreeMap<> ();

   private Map<String, Vehicle> vehicleRegistrationMap = new TreeMap<> ();
   private Long previousId = 0L;

   public Vehicle save (Vehicle vehicle) {
	  if (vehicle.getId () == null) {
		 vehicle.setId (++previousId);
	  }
	  vehicleMap.put (vehicle.getId (), vehicle);
	  return vehicle;
   }

   public Vehicle getVehicleById (Long id) {
	  return vehicleMap.get (id);
   }

   public Vehicle getVehicleByRegistrationNumber (String registrationNumber) {
	  return vehicleRegistrationMap.get (registrationNumber);
   }

}
