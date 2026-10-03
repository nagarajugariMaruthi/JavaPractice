package methods_Question;

import java.util.Arrays;
import java.util.List;

public class Example_8 {
	
	//  Sort Strings using:

//String::compareTo

	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"nagarathana", "Maruthi", "Manjula","nagaraju","Sunil", "pavitra"
				);
		
	  list.sort(String::compareTo);
	  
	  list.forEach(System.out::println);
	}

}
