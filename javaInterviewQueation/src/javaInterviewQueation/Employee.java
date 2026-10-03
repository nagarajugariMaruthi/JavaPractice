package javaInterviewQueation;

public class Employee {
	
	private String name;
	private int id;
	private String Department;
	
	public Employee(int id, String name, String department) {
		this.name = name;
		this.id = id;
		Department = department;
	}
	
	void display() {
		
		System.out.println("Employeeid = " + id);
		System.out.println("Employeename = " + name);
		System.out.println("Employeedepartment = " + Department);
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(105, "Maruthi", "Java Bakend Techenology ");
				
				emp.display();
		}
	}
