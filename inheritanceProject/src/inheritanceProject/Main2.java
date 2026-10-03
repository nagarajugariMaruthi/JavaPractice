package inheritanceProject;

public class Main2 {
 
	public static void main(String[] args) {
		
		Developer D = new Developer();
		
		D.EmployeeId = 10887;
		D.name = "Maruthi";
		D.Department = "Developer";
		D.salary = 500000;
		
		D.displayEmployee();
		D.displayDeveloper();
		
		
		System.out.println("---------Developer-- --------");
		
		
		Tester T = new Tester();
		
		T.EmployeeId = 501;
		T.name = "Dhanvitha";
		T.Department = "Tester";
		T.Experince = '5';
		
		T.displayEmployee();
		T.displayTester();
		
		
		System.out.println("--------tester-----------");
		
		
	}
}
		
	