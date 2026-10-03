package java8Conceptsquestion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

 public  class Employe {
   
	 int id;
	 String name;
	 String Department;
	 double Salary;
	 
	 
	 
	 public Employe(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		Department = department;
		Salary = salary;
	}



	 @Override
	 public String toString() {
		  return id + " " + name + " " + Department + " " + Salary;
	    }
	}
