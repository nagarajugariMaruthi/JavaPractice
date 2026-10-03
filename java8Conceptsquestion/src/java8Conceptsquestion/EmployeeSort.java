package java8Conceptsquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.function.Consumer;

public class EmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StudentEmployee> Employee = Arrays.asList(
				
				 new StudentEmployee(101, "Maruthi", "Java", 60000),
		            new StudentEmployee(102, "Rahul", "Testing", 45000),
		            new StudentEmployee(103, "Ravi", "Java", 55000),
		            new StudentEmployee(104, "Kiran", "HR", 40000)
		        );

		Consumer<List<StudentEmployee>> printEmployees = employeeList -> {
			
			Employee.sort(
					Comparator.comparingDouble(StudentEmployee::getsalary)
			);
			
			employeeList.forEach(employee ->
			System.out.println(
					employee.getid() + " " +
		                    employee.getname() + " " +
		                    employee.getDepartment() + " " +
		                    employee.getsalary()
		                )
		            );
		        };
	System.out.println(Employee);
	}
}
					
