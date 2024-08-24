package org.example.low_level_design.lld1.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Client {
   public static void main (String[] args) {
	  demoComparator();
   }

   private static void demoComparator () {
	  List<Student> students = Arrays.asList (
			  new Student (6, "Abi", 64),
			  new Student(45, "Ram", 43),
			  new Student(20, "Xavier", 99)
	  );
	  Comparator<Student> marksComparator = (mark1,mark2) -> mark1.mark - mark2.mark;
	  students.sort (marksComparator);
	  System.out.println ("Mark comparator");
	  System.out.println (students);

	  Comparator<Student> rollNoComparator = (rollNo1,rollNo2) -> rollNo1.rollNo-rollNo2.rollNo;
	  students.sort (rollNoComparator);
	  System.out.println ("Roll number comparator");
	  System.out.println (students);
   }
}
