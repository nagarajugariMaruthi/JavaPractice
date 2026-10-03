package opps_Methods;

public class Employe_1 {
 
	
	int empId;
	String empname;
	double empsalary;
	
	void takeinput(int i_empId, String i_empname, double i_empsalary) {
		
		empId =  i_empId;
		empname =  i_empname;
		empsalary = i_empsalary;
		
	}
	
	void printdata() {
	
	System.out.println(empId);
	System.out.println(empname);
	System.out.println(empsalary);
	
	}

	
	public static void main (String[] args) {
		 
		Employe_1 emp1 = new Employe_1();
	     emp1.takeinput(101, "Maruthi", 2500);
	     emp1.printdata();
	}
}
	