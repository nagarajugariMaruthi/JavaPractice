package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partitioningBy_18 {
	
	// 18. partitioningBy()
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(
				10,20,30,25,35,40
				);
		Map<Boolean, List<Integer>> result = number.stream()
				.collect(Collectors.partitioningBy(n -> n > 25));
		
		System.out.println(result);
	}
}
