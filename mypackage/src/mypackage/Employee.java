package mypackage;

 abstract class Employee {

 String name;
 int id;
 
 Employee(String name, int id) {
	 
	 this.name = name;
	 this.id = id;
 }
 
 abstract void caluculateSalary();
 
   void displayEmplyee() {
	   
	   System.out.println("Employee Name : " + name);
	   System.out.println("Employee ID : " + id);
   }
 }
 
 class FullTimeEmployee extends Employee {
	 
	 double monthlySalary;
	 
	 FullTimeEmployee(String name, int id, double monthlysalary) {
		 
	  super(name, id);
		  this.monthlySalary = monthlySalary;
		  
	  }
	 
	  @Override
	  void caluculateSalary() {
		  
		  System.out.println("Full time Salary : " + monthlySalary);
		  
	  }
 }
 
  class partimeEmployee extends Employee {
	 
	 int hours;
	 double rateperhours;
  
	 partimeEmployee(String name, int id, int hours , double rateperhours) {
		 
	  super(name , id);
	  this.name = name;
	  this.rateperhours = rateperhours;
	 }
  
	 @Override
	 
	 void caluculateSalary() {
		 
		 double Salary = hours * rateperhours;
		 System.out.println("Part Time Salary : " + Salary);
	 }
  }
	 