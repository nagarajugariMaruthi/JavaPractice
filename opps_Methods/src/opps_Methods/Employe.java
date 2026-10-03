package opps_Methods;

public class Employe {

	int EmpId;
	String EmpName;
	double EmpSalary;
	
	void takeinput(int l_EmpId, String l_EmpName, double l_EmpSalary) {
		
		EmpId = l_EmpId;
		EmpName = l_EmpName;
		EmpSalary = l_EmpSalary;
	}

	void printdate() {
		
		System.out.println(EmpId);
		System.out.println(EmpName);
		System.out.println(EmpSalary);
	}
	
	public static void main(String[] args) {
		
		Employe Emp1 = new Employe();
		Emp1.takeinput(202 ,"Dhanvitha", 90000);
		Emp1.printdate();
	}
}