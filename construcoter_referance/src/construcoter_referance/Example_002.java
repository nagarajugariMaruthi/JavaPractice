package construcoter_referance;

import java.util.Arrays;
import java.util.List;

public class Example_002 {
	
	// 2. Print List elements using Lambda.

  // list.forEach(x -> System.out.println(x));


	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java", "Python", "spring", "SQL");
		
		list.forEach(x -> System.out.println(x));
		
		
	}

}
