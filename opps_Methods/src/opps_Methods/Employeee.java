package opps_Methods;

public class Employeee {

  String EmpName;
  int EmpId;
  double EmpSalary;
  
  Employeee() {
 
	  EmpName = "Dhanvitha";
	  EmpId = 102;
	  EmpSalary = 48000;
	  
  }
  
 void printdate() {
	 
	 System.out.println("EmpName : " + EmpName);
	 System.out.println("Empid : " + EmpId);
	 System.out.println("EmpSalary : " + EmpSalary);
 }
  public static void main(String[] args) {	  
	  
	  Employee Emp1 = new Employee();
	  Emp1.printdate();
  }
  }
