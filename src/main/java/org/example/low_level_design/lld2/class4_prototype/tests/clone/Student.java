package org.example.low_level_design.lld2.class4_prototype.tests.clone;

public class Student implements Cloneable {
   private String name;
   private int rollNo;

   public Student (int rollNo, String name) {
	  this.rollNo=rollNo;
	  this.name = name;
   }

   public Object clone() throws CloneNotSupportedException {
	  return super.clone ();
   }

}
