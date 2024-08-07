package org.example.low_level_design.lld2.class4_prototype.tests.copyConstructor;

import java.util.List;

public class CreativeStudent extends Student {

   private int iq;

   public CreativeStudent (int rollNo, String name, List<Integer> marks, int iq) {
	  super (rollNo, name, marks);
	  this.iq = iq;
   }

   public CreativeStudent (CreativeStudent creativeStudent){
	  super (creativeStudent);
	  this.iq=creativeStudent.iq;
   }
}
