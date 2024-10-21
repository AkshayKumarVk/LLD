package org.example.low_level_design.lld3.parking_lot19102024.repositories;

import org.example.low_level_design.lld3.parking_lot19102024.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
   private Map<Long, Gate> gateMap = new HashMap<> ();
   private Long previousId = 0L;


   public Gate save (Gate gate) {
	  //update + insert ==> upsert

	  //insert
	  if (gate.getId () == null){
		 gate.setId (++previousId);
	  }
	  gateMap.put (gate.getId (), gate);

	  return gate;
   }

   public Optional<Gate> findGateById(Long id){

	  if (gateMap.containsKey (id)){
		 return Optional.of (gateMap.get (id));
	  }

	  return Optional.empty();
   }
}
