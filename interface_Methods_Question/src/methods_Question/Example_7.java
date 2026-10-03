package methods_Question;

import java.util.Arrays;
import java.util.List;


public class Example_7 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"10", "20", "30", "40", "50", "60", "70", "80","90","100"
				
				);
		
		 list.stream()
		 .map(Integer::parseInt)
		 .forEach(System.out::println);
	}
}
