package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;
 
 class Employee {
	 
	 int id;
	 String name;
	 double salary;
	 
	 public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	 }
	 
	  @Override
	  public String toString() {
		  
		  return id  + " " + name + " " + salary;
	  }
 }

public class Example_11 {
	
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				
				new Employee(102, "maruthi:", 40000),
				new Employee(103, "dhanvitha:", 50000),
				new Employee(104, "nagaraju:", 60000)
				
	);
		
		list.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
		
		list.forEach(e -> System.out.println(e));
	}
}
		