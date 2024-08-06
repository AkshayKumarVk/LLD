package org.example.low_level_design.lld1.inheritance.assignment.three_point;

public class Client {
   public static void main (String[] args) {
	  demoPoint();
   }

   private static void demoPoint () {
	  ThreedPoint threedPoint=new ThreedPoint ();

	  threedPoint.x=23;
	  threedPoint.y=34;

   }
}
