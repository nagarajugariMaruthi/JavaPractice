package java8Conceptsquestion;

import java.util.List;
import java.util.Arrays;
import java.util.function.Supplier;

public class EmployeeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<List<String>> Employeenames = () ->
		
		Arrays.asList("Maruthi", "Dhanvith", "Sony", "sashi", "Nani");
		
		System.out.println(Employeenames.get());
	}
}


