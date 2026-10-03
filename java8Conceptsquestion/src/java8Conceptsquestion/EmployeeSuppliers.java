package java8Conceptsquestion;

import java.util.function.Supplier;

public class EmployeeSuppliers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Employees> Employeenames = () -> new Employees();
		
		Employees Employees = Employeenames.get();
		
		Employees.display();
	}
}
