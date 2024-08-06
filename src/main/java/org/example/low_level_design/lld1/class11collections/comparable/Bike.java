package org.example.low_level_design.lld1.class11collections.comparable;

public class Bike implements Comparable<Bike> {

   private String name;
   private int price;
   private int manufactureYear;
   private int maxSpeed;

   public Bike (String name, int price, int manufactureYear, int maxSpeed) {
	  this.name = name;
	  this.price = price;
	  this.manufactureYear = manufactureYear;
	  this.maxSpeed = maxSpeed;
   }

   @Override
   public int compareTo (Bike bike) {
	  return this.price - bike.price;
   }

   @Override
   public String toString () {
	  return (this.name + " - " + this.price + " - " + this.manufactureYear + " - " + this.maxSpeed);
   }

}
