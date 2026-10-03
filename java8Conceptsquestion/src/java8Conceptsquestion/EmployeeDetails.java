package java8Conceptsquestion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employeeee> Employeee = Arrays.asList(
				
				new Employeeee(102, "maruthi", "java Developer = " , 800000),
				new Employeeee(103, "dhanvitha", "C++ Developer = ", 100000),
				new Employeeee(104,  "Nagarathan", "Embedded Developer = ", 120000)
				);

		 Consumer<Employeeee> printemployeeee = Employeeee -> {
			 
			 System.out.println("id = " + Employeeee.getid());
			 System.out.println("name = " + Employeeee.getname());
			 System.out.println("department = " + Employeeee.getdepartment());
			 System.out.println("salary = " + Employeeee.getsalary());
		 };
	
		 Employeee.forEach(printemployeeee);
			
		}
	}

