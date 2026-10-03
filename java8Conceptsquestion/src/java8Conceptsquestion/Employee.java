package java8Conceptsquestion;

import java.util.*;
import java.util.function.Predicate;
public class Employee {
	
	// 2. Using `Predicate<Employee>`, filter employees whose **salary is greater than ₹50,000**.
	
	private int id;
	String name;
	double Salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	 
	  @Override
	  
	  public String toString() {
		  return id + " " + name + " " + Salary;
	  }
}
