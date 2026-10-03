package stringInterview_imp;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private double Salary;
	
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		Salary = salary;
	}
	
	public int getid() {
		return id;
		
	}
	
	public String getname() {
		 return name;
		 
	}
	
	public String getdepartment() {
		return department;
		
	}
	
	public double getSalary() {
		
		return Salary;
		
	}
	
	  @Override
	  public String toString() {
		  
		  return id + '|' + name + '|' + department + '|' + Salary;
		  
	  }
}