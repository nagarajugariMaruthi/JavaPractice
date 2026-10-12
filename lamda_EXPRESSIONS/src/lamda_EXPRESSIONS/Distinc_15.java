package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class Distinc_15 {
	
	// 14. distinct()
	public static void main(String[] args) {
		
		List<Integer> Number = Arrays.asList(
				
				10,20,20,10,30,40,30,50,50
				);
		
		 Number.stream()
		 .distinct()
		 .forEach(System.out::println);
	}

}
