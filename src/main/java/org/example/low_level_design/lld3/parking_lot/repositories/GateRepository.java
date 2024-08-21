package org.example.low_level_design.lld3.parking_lot.repositories;

import org.example.low_level_design.lld3.parking_lot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {

   private final Map<Long, Gate> gateMap = new TreeMap<> ();
   private Long previousGateId = 0L;


   //   Saving Gate
   public Gate save (Gate gate) {
	  if (gate.getId () == null) {
		 gate.setId (++previousGateId);
	  }
	  gateMap.put (gate.getId (), gate);
	  return gate;
   }

//   Filtering gate by id

   public Optional<Gate> findGateById (Long id) {
	  if (gateMap.get (id) == null) {
		 return Optional.empty ();
	  }
	  return Optional.of (gateMap.get (id));
   }

//   Delete

   public Gate delete (Long id) {
	  return gateMap.remove (id);
   }

}
