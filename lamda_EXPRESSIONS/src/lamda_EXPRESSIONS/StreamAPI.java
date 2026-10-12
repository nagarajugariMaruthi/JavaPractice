package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
	// 10. Stream API
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(10,20,30,40,50,50,50,60,7,70);
		
		number.stream()
		.filter(n->  n > 10)
		.forEach(System.out::println);
		
		
		
	}

}
