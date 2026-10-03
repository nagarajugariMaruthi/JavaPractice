package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_3 {
	
	// 3. Find numbers greater than 10.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,10,20,30,40,50,60,65);
		
		list.stream()
		.filter(n -> n > 30)
		.forEach(n -> System.out.println(n));
	}

}
