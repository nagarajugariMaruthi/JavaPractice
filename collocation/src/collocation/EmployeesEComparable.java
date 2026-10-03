package collocation;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeesEComparable {
	
	class Employee implements Comparable<Employee> {
		
		int id;
		String name;
		double Salary;
		
		Employee(int id, String name, double Salary) {
			
			this.id = id;
			this.name = name;
			this.Salary = Salary;
			
		}
		
		  @Override
		  public int compareTo(Employee e) {
			  return this.name.compareTo(e.name);
		}
		
		  void display() {
			  System.out.println(id + " " + name + " " + Salary);
		  }
	}
}
		