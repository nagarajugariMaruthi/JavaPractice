package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_1 {
	
	// 1. Find even numbers from List.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,15,20,25,30,35);
		
		list.stream()
		.filter(n -> n % 2 ==0)
		.forEach(n -> System.out.println(n));
	}
}
