package opps_Methods;

public class Employee_2 {

 String EmpName;
 int EmpAge;
 int EmpMarks;
 

void takeinput(String l_EmpName, int l_EmpAge, int l_EmpMarks) {
	
 EmpName = l_EmpName;
 EmpAge = l_EmpAge;
 EmpMarks = l_EmpMarks;

}

void printdate() {
	
	System.out.println("Enter the EmpName : " + EmpName);
	System.out.println("Enter the EmpAge : " + EmpAge);
	System.out.println("Enter the StudentMarks : " + EmpMarks);
}

public static void main(String[] agrs) {
	
	Employee_2 Emp1 = new Employee_2();
	Emp1.takeinput("Dhanvitha" , 24 , 99);
	Emp1.printdate();
}
}