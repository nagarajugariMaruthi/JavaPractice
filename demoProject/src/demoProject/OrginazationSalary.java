package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.DoubleSummaryStatistics;

  class OrganizationEmployee {
	  
	  private int id;
	  private String name;
	  private double salary;
	  
	  
	  OrganizationEmployee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	  }
	  
	  public double getsalary() {
		  return salary;
	  }
	  
	  
  }

public class OrginazationSalary {
	
	// 13.  What is the average salary and total salary of the whole organization ?
	
	public static void main(String[] args) {
		
		List<OrganizationEmployee> Employee = Arrays.asList(
				
				new OrganizationEmployee(110, "maruthi", 50000),
				new OrganizationEmployee(120, "dhanvitha", 90000),
				new OrganizationEmployee(130, "nuthansai", 60000),
				new OrganizationEmployee(140, "sunil gowda", 40000)
				
				);
		
		DoubleSummaryStatistics statistics = Employee.stream()
				.mapToDouble(OrganizationEmployee::getsalary)
				.summaryStatistics();
		
		System.out.println("total salary : " + statistics.getSum());
		System.out.println("average salary : " + statistics.getAverage());
	}

}
