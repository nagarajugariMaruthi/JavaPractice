package inheritanceProject;

public class Employee_1 {

 int Employeeid;
 String Employeename;
 double Salary;
 
 Employee_1(int Employeeid, String Employeename, double Salary) {
	 
	 this.Employeeid  = Employeeid;
	 this.Employeename = Employeename;
	 this.Salary = Salary;
	 
 }
 
 @Override

	 public String toString() {
	        return "Employee [employeeId=" + Employeeid +
	               ", employeeName=" + Employeename +
	               ", salary=" + Salary + "]";
	    }
	}