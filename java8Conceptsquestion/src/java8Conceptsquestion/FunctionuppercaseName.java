package java8Conceptsquestion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionuppercaseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> EmployeeNames = 
				Arrays.asList("Maruthi", "Sony", "dhanvith", "Nani", "kiran");
						
						Function<String, String> uppercase = 
						
						emp -> emp.toUpperCase();
						
						List<String> result = EmployeeNames.stream() 
								.map(uppercase) 
								.collect(Collectors.toList()); 
						System.out.println(result); 
	}
}