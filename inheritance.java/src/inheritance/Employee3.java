package inheritance;

public class Employee3 {

	int EmployeeId;
	String EmployeeName;
  
	public void DisplayEmployee() {
		
		System.out.println("EmployeeId : " + EmployeeId);
		System.out.println("EmployeeName : " + EmployeeId);
	}
}


 class  Manager extends Employee {
	
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
	   
	   obj.display();
	   obj.Display();
	}
}