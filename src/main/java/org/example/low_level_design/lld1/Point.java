package org.example.low_level_design.lld1;

public class Point {

   int x;
   int y;


   public Point(int x, int y){
	  this.x=x;
	  this.y=y;
   }

   public Point(Point copyPoint){
	  this.x=copyPoint.x;
	  this.y=copyPoint.y;
   }
}
