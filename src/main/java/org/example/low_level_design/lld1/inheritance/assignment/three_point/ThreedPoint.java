package org.example.low_level_design.lld1.inheritance.assignment.three_point;

public class ThreedPoint extends  Point {
   // write the code of Threedpoint class here

   private int z;

   @Override
   public void display(){
	  System.out.println("[" + x + ", " + y + ", " + z + "]");
   }
}
