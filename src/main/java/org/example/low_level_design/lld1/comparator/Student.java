package org.example.low_level_design.lld1.comparator;

public class Student {
   public int rollNo;
   public String name;
   public int mark;

   public Student (int rollNo, String name, int mark) {
	  this.rollNo = rollNo;
	  this.name = name;
	  this.mark = mark;
   }

   @Override
   public String toString(){

	  return "[roll No "+ rollNo + ", name " + name +", mark " + mark + "]";
   }

}
