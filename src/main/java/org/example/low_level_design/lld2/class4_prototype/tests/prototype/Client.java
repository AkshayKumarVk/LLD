package org.example.low_level_design.lld2.class4_prototype.tests.prototype;

import com.fasterxml.jackson.core.JsonToken;

import java.util.ArrayList;
import java.util.List;

public class Client {
   public static void main (String[] args) {
//	  demoPrototype ();

	  demoRegistry ();
   }

   private static void demoRegistry () {
	  StudentRegistry studentRegistry = new StudentRegistry ();

	  fillRegistry (studentRegistry);

	  Student stPrototype=studentRegistry.get (StudentType.STUDENT);
	  Student isPrototype = studentRegistry.get (StudentType.INTELLIGENT_STUDENT);
	  Student csPrototype = studentRegistry.get (StudentType.CREATIVE_STUDENT);

	  Student stCopy=stPrototype.copy ();

	  Student isCopy=isPrototype.copy ();

	  Student csCopy= csPrototype.copy ();

	  System.out.println ("debug");
   }

   private static void fillRegistry (StudentRegistry studentRegistry) {
	  List<Integer> marks = new ArrayList<> ();
	  marks.add (90);
	  marks.add (84);
	  marks.add (78);

	  Student student = new Student (23, "Ramu", marks);

	  Student intelligentStudent = new IntelligentStudent (12, "Raju", marks, 129);

	  Student creativeStudent = new CreativeStudent (34, "Joy", marks, 32);
	  studentRegistry.register (StudentType.STUDENT, student);
	  studentRegistry.register (StudentType.INTELLIGENT_STUDENT, intelligentStudent);
	  studentRegistry.register (StudentType.CREATIVE_STUDENT, creativeStudent);
   }

   private static void demoPrototype () {
	  List<Integer> marks = new ArrayList<> ();

	  marks.add (70);
	  marks.add (95);
	  marks.add (59);

	  Student studentOg = new Student (23, "Ravi", marks);
	  Student studentCopy = studentOg.copy ();

	  IntelligentStudent intelligentStudentOg = new IntelligentStudent (25, "Ram", marks, 123);
	  IntelligentStudent intelligentStudentCopy = intelligentStudentOg.copy ();

	  CreativeStudent creativeStudentOg = new CreativeStudent (32, "Jose", marks, 234);
	  Student creativeStudentCopy = creativeStudentOg.copy ();

	  System.out.println ("debug");
   }
}
