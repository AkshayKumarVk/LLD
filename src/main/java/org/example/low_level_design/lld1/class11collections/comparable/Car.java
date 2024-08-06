package org.example.low_level_design.lld1.class11collections.comparable;

public class Car implements Comparable<Car> {
   private final int number;
   private final String modelName;
   private final String color;
   private final int price;
   private final int year;
   private final String brand;
   private final int maxSpeed;

   public Car (int number, String modelName, String color, int price, int year, String brand, int maxSpeed) {
	  this.number = number;
	  this.modelName = modelName;
	  this.color = color;
	  this.price = price;
	  this.year = year;
	  this.brand = brand;
	  this.maxSpeed = maxSpeed;
   }

   public int compareTo (Car other) {
//	  return this.maxSpeed - other.maxSpeed;
	  return other.maxSpeed - this.maxSpeed;
   }


   public String toString () {
	  return this.number + " - " + this.modelName + " - " + this.color + " - " + this.price + " - " + this.year
					 + " - " + this.brand + " - " + this.maxSpeed;
   }

}
