package org.example.low_level_design.lld1.comparator;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Employee {
   private final int id;
   private final String name;
   private final int age;

   public Employee (int id, String name, int age) {
	  this.id = id;
	  this.age = age;
	  this.name = name;
   }

   @Override
   public String toString () {
	  return id + " " + name + " " + age;
   }
   public class Client {
	  public static void main (String[] args) {

		 List<Employee> employees = Arrays.asList (
				 new Employee (12, "ram", 87),
				 new Employee (12, "ram", 43),
				 new Employee (12, "ram", 53));
		 Comparator<Employee> comparator = (e1,e2)  -> e1.getAge ()-e2.getAge ();
		 employees.sort (comparator);

	  }
   }

}

