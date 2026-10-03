package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_18 {
	
	// 18. Get first 5 elements.
	
	public static void main(String[] args) {
		
		List<Integer>  list = Arrays.asList(10,20,30,40,50,60,70,80);
		
		  list.stream()
		    .limit(6)
		    .forEach(n -> System.out.println(n));
	}

}
