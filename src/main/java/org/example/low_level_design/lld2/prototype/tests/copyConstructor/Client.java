package org.example.low_level_design.lld2.prototype.tests.copyConstructor;

import java.util.ArrayList;
import java.util.List;

public class Client {
   public static void main (String[] args) {
	  demoCopyConstructor ();
   }

   private static void demoCopyConstructor () {
	  List<Student> students = new ArrayList<> ();
	  List<Student> studentsCopy = new ArrayList<> ();

	  List<Integer> marks = new ArrayList<> ();

	  marks.add (75);
	  marks.add (58);
	  marks.add (90);

	  Student student = new Student (12, "Ram", marks);
	  Student intelligentStudent = new IntelligentStudent (21, "Jose", marks, 150);
	  Student creativeStudent = new CreativeStudent (25, "Raju", marks, 150);

	  students.add (student);
	  students.add (intelligentStudent);
	  students.add (creativeStudent);


	  for (Student s : students) {
		 Student stCopy = null;

		 if (s instanceof IntelligentStudent) {
			IntelligentStudent isCopy = (IntelligentStudent) s;
		 } else if (s instanceof CreativeStudent) {
			CreativeStudent csCopy = (CreativeStudent) s;
		 } else {
			stCopy = new Student (s);
		 }
		 studentsCopy.add (stCopy);
	  }

	  Student st2 = student;
	  Student st3 = new Student (student);


	  System.out.println ("debug");
   }
}
