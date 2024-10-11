package org.example.low_level_design.lld1.stream;

import org.example.low_level_design.lld1.comparator.Student;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Client {
   public static void main (String[] args) {
	  findOddUsingStream ();
	  demoStream2 ();
	  flatMap();
   }

   private static void flatMap () {

	  List<List<String>> stringList = Arrays.asList (
			  Arrays.asList ("banana", "apple", "orange"),
			  Arrays.asList("cat", "dog", "cow"),
			  Arrays.asList("parrot", "duck", "peacock")
	  );

	  List<String> flattenList = stringList.stream ().flatMap (List::stream).toList ();
	  System.out.println (flattenList);
   }

   private static void demoStream2 () {
	  List<Student> students = Arrays.asList (
			  new Student (6, "Abi", 64),
			  new Student (45, "Ram", 43),
			  new Student (20, "Xavier", 99)
	  );
	  System.out.println (students.stream ().map ((student -> student.mark)).toList ());

	  System.out.println (students.stream ().map (Student::toString).toList());

	  List<String> student1 = Arrays.asList ("Ramesh", "Suresh", "Raghavan");
	  System.out.println (student1.stream ().map (String::toUpperCase).toList ());

   }

   private static void findOddUsingStream () {
	  List<Integer> list = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	  List<Integer> oddList = list.stream ().filter ((x) -> x % 2 == 1).toList ();
	  List<Integer> evenList = list.stream ().filter ((y) -> y % 2 == 0).toList ();
	  System.out.println (evenList);
	  System.out.println (oddList);
   }
}
