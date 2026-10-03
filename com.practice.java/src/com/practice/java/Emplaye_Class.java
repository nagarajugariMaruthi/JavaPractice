package com.practice.java;
import java.util.Scanner;
public class Emplaye_Class {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.println("Enter Employee name: ");
	        String name = sc.nextLine();
	        
	        System.out.println("Enter the basic salary: ");
	        double salary = sc.nextDouble();
	        
	        // add employee
	        Employee emp = new Employee(id,name, salary);
	        
	        // calculate salary and generate payslip
	        emp.generatepayslip();
	        
	        sc.close();
	    }
	}
	    
	class Employee {
	    private int empId;
	    private String name;
	    private double basicSalary;
	    
	    // constructor
	    Employee(int empId, String name, double basicSalary) {
	        this.empId = empId;
	        this.name = name; 
	        this.basicSalary = basicSalary;
	    }
	    
	    //  methed to calulate salary 
	    public double calucateSalary() {
	        double hra = basicSalary * 0.20; // 20% HRA
	        double da = basicSalary * 0.10; // 10% DA
	        return basicSalary + hra + da;
	        
	    }
	    
	    // method to generate payslip
	    public void generatepayslip() {
	        System.out.println("\n------ PAYSLIP ------");
	        System.out.println("Employee ID  : " + empId);
	        System.out.println("Employee Name : " + name);
	        System.out.println("Basic Salary : " + basicSalary);
	        System.out.println("net salary : " + calucateSalary());
	    }
	}
