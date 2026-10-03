package collocation;

import java.util.ArrayList;
import java.util.Collections;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeesEComparable obj = new EmployeesEComparable();
		
		ArrayList<EmployeesEComparable.Employee> List = new ArrayList<>();
		
		List.add(obj.new Employee(102, "Maruthi",30000));
		List.add(obj.new Employee(105, "dhanvitha" , 50000));
		List.add(obj.new Employee(106, "Nagaraju" , 700000));
		
		Collections.sort(List);
	
	
	System.out.println("Employee Sorted Names : ");

	
	for(EmployeesEComparable.Employee  e: List) {
		e.display();
	}
}
}