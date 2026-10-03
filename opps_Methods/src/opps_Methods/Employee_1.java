package opps_Methods;

public class Employee_1 {

 
 String EmpName;
 int EmpAge;
 double EmpSalary;
 

 void takeinput(String l_EmpName, int l_EmpAge, double l_EmpSalary) {
	 
  EmpName = l_EmpName;
  EmpAge = l_EmpAge;
  EmpSalary = l_EmpSalary;
 }
 
 void printdate() {
	 
	 System.out.println(EmpName);
	 System.out.println(EmpAge);
	 System.out.println(EmpSalary);
 }
 
 public static void main(String[] args) {
	 
	 Employee_1 Emp1 = new Employee_1();
	 
	 Emp1.takeinput("Maruthi" , 26 , 45000);
	 Emp1.printdate();
 }
}