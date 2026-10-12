package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class filter {
	
	// 11. filter()
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(
				10,20,30,40,50,60,70,80,90
				
				);
		
		number.stream()
		.filter(n -> n > 20)
		.forEach(System.out::println);
	}

}
