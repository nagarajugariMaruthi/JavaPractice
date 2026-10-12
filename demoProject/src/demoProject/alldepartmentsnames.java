package demoProject;

import java.util.Arrays;
import java.util.List;

  class Department {
	 
	 private int id;
	 private String name;
	 
	 public Department(int id , String name ) {
		 
		 this.id = id;
		 this.name = name;
		 
	 }
	 
	 public String getname() {
		 return name;
	 }
	 
 }
public class alldepartmentsnames {
	
	// 2. Print the name of all departments in the organization ? 
    
	public static void main(String[] args) {
		
		List<Department> Departments = Arrays.asList(
				
				new Department(1, "IT"),
				new Department(2,  "Hr"),
				new Department(3,  "Developer"),
				new Department(4,  "Finance"),
				new Department(5, "marketing"),
				new Department(6, "Sales Marketing")
				);
		  
		   Departments.stream().map(Department::getname).forEach(System.out::println);
	}
	}