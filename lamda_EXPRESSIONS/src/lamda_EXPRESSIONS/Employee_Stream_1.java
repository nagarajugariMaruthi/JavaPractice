package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

  class Employee {
	// 1. Find employees whose salary > 50000.
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
	
	this.id = id;
	this.name = name;
	this.salary = salary;
	
	}
	public String getname() {
		return name;
	}
	
	public double getsalary() {
		  return salary;
	}
	
	  @Override
	  public String toString() {
		  
		  return id + " " + name + " " + salary;
	  }
	  public int getage() {
		// TODO Auto-generated method stub
		return 0;
	  }
		 
 }
  public class Employee_Stream_1 {
	  
	  public static void main(String[] args) {
		  
		  List<Employee> Employee = Arrays.asList(
				  
				  new Employee(102, "maruthi:", 30000),
				  new Employee(103, "dhanvitha:", 50000),
				  new Employee(104, "Nagarathana:", 60000),
				  new Employee(105, "shashi kumar:", 33000),
				  new Employee(106, "vamshi gowda:", 70000)
				  
				  );
		  
		  Employee.stream()
		       .filter(emp -> emp.getsalary() > 33000)
		       .forEach(System.out::println);
				  
				  
	  }

}
