package org.example.low_level_design.lld2.prototype.tests.copyConstructor;

import java.util.List;

public class IntelligentStudent extends Student {
   private int 	intelligence;

   public IntelligentStudent (int rollNo, String name, List<Integer> marks, int intelligence) {
	  super (rollNo, name, marks);
	  this.intelligence = intelligence;
   }

   public IntelligentStudent (IntelligentStudent intelligentStude) {
	  super (intelligentStude);
	  this.intelligence = intelligentStude.intelligence;
   }
}
