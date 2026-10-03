package method_Basic_Practice;

public class Employee_1 {

  int id;
  String  name;


	public static void main(String[] args) {
		
		// Creating Employe objecting new keywords 
		
		    Employee_1 e1 = new Employee_1();
	        Employee_1 e2 = new Employee_1();
	        Employee_1 e3 = new Employee_1();
	        Employee_1 e4 = new Employee_1();
		
		// Assining value 
	   
		e1 .id = 101;
		e1 .name = "Maruthi\n";
		
		e2 .id = 102;
		e2 . name = "Sunil\n";
		
		e3 .id  = 103;
		e3 .name  = "Vamshi\n";
		
		e4 .id = 104;
		e4 .name = "Eswar\n";
		
		// print the value 
		
		System.out.println("Employee = 1");
		System.out.println("Enter the id = " + e1.id);
		System.out.println("Enter the name = " + e1.name);
		
		System.out.println("Employe - 2");
		System.out.println("ID = " + e2.id);
		System.out.println("Name = " + e2.name);
		
		System.out.println("Employee = 3" );
		System.out.println("Employe ID = " + e3.id);
		System.out.println("EMployee name = " + e4.name);
		
		System.out.println("Employee = 4" );
		System.out.println("Emplloyee ID = " + e4.id);
		System.out.println("Employee Name = " + e4.name);
	}
}
