package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_6 {
	
	// 6. Find sum of numbers.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,80);
		
		int sum = list.stream()
				.mapToInt(n -> n)
				.sum();
		System.out.println("sum: " + sum);
	}

}
