package org.example.low_level_design.lld1.Accessibility.methodOverriding;

public class ThreePoint extends Point {

   private final int z;


   ThreePoint (int x, int y, int z) {
	  super (x, y);
	  this.z = z;
   }


   public  void display(){
	  System.out.println (x+","+y+","+z);
	  System.out.println ("Three Point");
   }
}
