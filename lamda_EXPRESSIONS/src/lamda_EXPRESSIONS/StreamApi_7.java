package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_7 {
	
	// 7. Find average of numbers.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,50,60,80,90,70);
	
		double Average = list.stream()
				.mapToInt(n -> n)
				.average()
				.getAsDouble();
		
		System.out.println("Average: " + Average);
	}

}
