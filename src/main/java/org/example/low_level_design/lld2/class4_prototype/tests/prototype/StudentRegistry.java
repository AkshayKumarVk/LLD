package org.example.low_level_design.lld2.class4_prototype.tests.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
   private Map<StudentType, Student> registry = new HashMap<> ();

   public void register (StudentType studentType, Student student) {
	  registry.put (studentType, student);
   }

   public Student get (StudentType studentType) {
	  return registry.get (studentType);
   }
}
