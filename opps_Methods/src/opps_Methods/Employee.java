package opps_Methods;

public class Employee {
 
	int EmpId;
	String EmpName;
	double EmpSalary;
	
	void takeinput(int l_EmpId, String l_EmpName, double l_EmpSalary) {
		
		EmpId = l_EmpId;
		EmpName = l_EmpName;
		EmpSalary= l_EmpSalary;
		
	}
	
	void printdate() {
	
	System.out.println(EmpId);
	System.out.println(EmpName);
	System.out.println(EmpSalary);
}
	public static void main(String[] args) {
		
		Employee Emp1 = new Employee();
		Emp1.takeinput(105 ,"Maruthi", 45000);
		Emp1.printdate();
	}
	}