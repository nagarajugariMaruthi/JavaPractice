package inheritance;

public class Employee2 {

	int EmployeeId;
	String EmployeeName;
  
	public void DisplayEmployee() {
		
		System.out.println("EmployeeId : " + EmployeeId);
		System.out.println("EmployeeName : " + EmployeeName);
	}
}


 class  Manager extends Employee2 {
	
	String department;
	 double salary;
	 
	 void display() {
		 
		 System.out.println("departmen Name : " + department);
		 System.out.println("salary  : " + salary);
	 }
}
	
class  EmployeeMain  {
	
	public static void main(String[] args) {
		
	   Manager obj = new Manager();
	   
	   obj.EmployeeId = 102;
	   obj.EmployeeName = "dhanvitha";
	   obj.department = "chemistry department";
	   obj.salary = 50000;
	   
	   obj.DisplayEmployee();
	   obj.display();
	}
}