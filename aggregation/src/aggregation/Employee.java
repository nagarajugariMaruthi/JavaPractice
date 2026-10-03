package aggregation;

public class Employee {

  String Name;
  Laptop Laptop;
  
   Employee(String Name , Laptop Laptop) {
	   
	   this.Laptop = Laptop;
	   this.Name = Name;
	  
   }
   
   void displayEmployee() {
	   
	   System.out.println("Employee name : " + Name);
	   
	   Laptop.displayLaptop();
   }
}