package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_12 {
	
	// 12. Find unique numbers.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,10,20,40,50,60,70);
		
		  list.stream()
	      .distinct()
	      .forEach( n-> System.out.println(n));
	}
}
