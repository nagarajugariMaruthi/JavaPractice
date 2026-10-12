package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect_16 {

	// 16. collect()
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(10,20,30,40,50,60,70,80,90);
		
		List<Integer> result = number.stream()
				    .filter(n -> n > 30)
				    .collect(Collectors.toList());
		
		System.out.println(result);
	}
}
