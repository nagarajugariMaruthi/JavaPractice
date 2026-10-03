package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;


public class StreamApi_10 {
	
	// 10. Remove duplicates.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,10,30,20,40,30,50,60,70,50);
		
		   list.stream()
		   .distinct()
		   .forEach(n -> System.out.println(n));
	}

}
