package org.example.low_level_design.lld2.class4_prototype.tests.prototype;

import java.util.List;

public class CreativeStudent extends Student {
   private  int creativity;

   public CreativeStudent (int rollNo, String name, List<Integer> marks, int creativity) {
	  super (rollNo, name, marks);
	  this.creativity = creativity;
   }

   public CreativeStudent (CreativeStudent creativeStudent){
	  super (creativeStudent);
	  this.creativity=creativeStudent.creativity;
   }


   public CreativeStudent copy(){
	  return new CreativeStudent (this);
   }
}
