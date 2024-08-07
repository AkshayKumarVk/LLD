package org.example.low_level_design.lld2.class4_prototype.tests.prototype;

import java.util.List;

public class IntelligentStudent extends Student {
   private int iq;

   public IntelligentStudent (int rollNo, String name, List<Integer> marks, int iq) {
	  super (rollNo, name, marks);
	  this.iq = iq;
   }

   public IntelligentStudent (IntelligentStudent intelligentStudent) {
	  super (intelligentStudent);
	  this.iq=intelligentStudent.iq;
   }

   public IntelligentStudent copy(){
	  return new IntelligentStudent (this);
   }
}
