package constructor_Practice;

public class Employee {

	String employeeName = "Maruthi";
	double employeeSalary = 35000;
	
	void displaySalary() {
		
		System.out.println("EmployeeName : " + employeeName);
		System.out.println("EmployeeSalary : " + employeeSalary);
		
	}
	
	public static void main(String[] args) {
		
		Employee Emp1 = new Employee();
		
		Emp1.displaySalary();
	}
	}
	

