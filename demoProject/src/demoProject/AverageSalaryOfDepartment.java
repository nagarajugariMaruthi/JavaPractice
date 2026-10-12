package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

  class DepartmentSalary {
	  
	  private int id;
	  private String name;
	  private String Department;
	  private double salary;
	  
	  
	  public DepartmentSalary(int id, String name, String Department, double salary) {
		this.id = id;
		this.name = name;
		this.Department = Department;
		this.salary = salary;
		
	  }
	  
	  public String getDepartment() {
		  return Department;
	  }
	  
	  public double getsalary() {
		  return salary;
	  }
	  
	  
  }
public class AverageSalaryOfDepartment {
 
	//  7. What is the average salary of each department ?	
	public static void main(String[] args) {
		
		List<DepartmentSalary> Departmentsalary = Arrays.asList(
				
				new  DepartmentSalary(1, "maruthi", "it", 50000), 
				new  DepartmentSalary(2, "dhanvitha","hr",  40000),
				new  DepartmentSalary(3, "nagaraju", "it", 50000),
				new  DepartmentSalary(4, "manjula", "marketing head", 40000), 
				new  DepartmentSalary(5, "manju ", " sales marketing", 70000)
				
				);
	  
Map<String, Double> result = Departmentsalary.stream()
.collect(Collectors.groupingBy(DepartmentSalary::getDepartment,Collectors.averagingDouble(DepartmentSalary::getsalary)
		));

System.out.println("average salary of each department : " + result);
}
}