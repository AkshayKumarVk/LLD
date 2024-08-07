package org.example.low_level_design.lld2.class4_prototype.tests.copyConstructor;

import java.util.List;

public class Student {
   private final int rollNo;
   private final String name;
   private List<Integer> marks;

   public Student (int rollNo, String name, List<Integer> marks) {
	  this.marks=marks;
	  this.name = name;
	  this.rollNo = rollNo;
   }

   public Student (Student student) {
	  this.name = student.name;
	  this.rollNo = student.rollNo;
	  this.marks=student.marks;
   }
}
