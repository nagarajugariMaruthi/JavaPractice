package construcoter_referance;

import java.util.Arrays;
import java.util.List;

public class Example_001 {
	
	//  Print List elements using forEach().
// list.forEach(System.out::println);
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "Python", "SqL", "C++");
		
	list.forEach(System.out::println);
		
	}


}
