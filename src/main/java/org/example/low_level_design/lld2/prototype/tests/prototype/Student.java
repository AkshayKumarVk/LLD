package org.example.low_level_design.lld2.prototype.tests.prototype;

import java.util.List;

public class Student implements Prototype<Student>{
   private int rollNo;
   private  String name;
   private List<Integer> marks;

   public Student (int rollNo, String name, List<Integer> marks) {
	  this.rollNo=rollNo;
	  this.name=name;
	  this.marks=marks;
   }
   public Student(Student student){
	  this.rollNo=student.rollNo;
	  this.name=student.name;
	  this.marks=student.marks;
   }

   @Override
   public Student copy(){
	  return new Student (this);
   }
}
