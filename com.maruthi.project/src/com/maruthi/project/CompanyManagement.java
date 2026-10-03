package com.maruthi.project;
import java.util.ArrayList; 

	// interface
	interface printable {
	    void display();
	}

	// Abstract class 
	abstract  class person {
	    protected String name;
	    
	    public person(String name) {
	        this.name = name;
	    }
	    
	    abstract void work();
	}

	// inheritance
	class Employee extends person implements printable {
	    private int id;
	    private double salary;
	    
	    // constructor
	    public Employee(int id, String name, double salary) {
	        super(name);
	        this.id = id;
	        this.salary = salary;
	    }
	    
	    // Method overriding
	    @Override
	    void work() {
	        System.out.println(name + " is working.");
	    }
	    
	    @Override
	    public void display() {
	        System.out.println("ID : " + id);
	        System.out.println("name : " + name);
	        System.out.println("salary : " + salary);
	    }
	    
	    // Encapsulation
	    public double getSalary() {
	        return salary;
	    }
	}

	public class CompanyManagement {
	    
	    public static void main(String[] args) {
	        
	        // Array 
	        int[] marks = {80, 85, 90};
	        
	        System.out.println("Marks: ");
	        for(int Marks : marks) {
	            System.out.println(marks);
	        }
	        
	        // ArrayList 
	        ArrayList<Employee> employee = new ArrayList<>();
	        
	        employee.add(new Employee(101, "Maruthi", 50000));
	        employee.add(new Employee(102, "sunil", 60000));
	        employee.add(new Employee(103, "Ravi", 55000));
	        
	        System.out.println("\nEmployee Details: ");
	        
	        // polymorphism 
	        for(Employee emp : employee) {
	            emp.display();
	            emp.work();
	            
	            // conditional statement 
	            if(emp.getSalary() > 55000) {
	                System.out.println("Hingh salary Employee");
	            } else {
	                System.out.println("Normal salary Employee");
	            }
	            
	            System.out.println("------------------");
	        }
	        
	        // Exception Handling 
	        try {
	            int result = 10 / 0;
	            System.out.println(result);
	        } catch (ArithmeticException e) {
	     System.out.println("Eception caught: cannot divide by zero.");
	        }
	        
	        System.out.println("program completed successfully.");
	        
	    }
	}
    
