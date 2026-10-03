package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCollectors_9 {
	
	// 9. Count occurrences of List elements.

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
				
				"maruthi",
				"dhanvitha",
				"Maruthi",
				"dhanvitha",
				"nagaraju",
				"maruthi",
				"maruthi",
				"dhanvitha",
				"nagarathana"
				
				);
				
			Map<String, Long> result = names.stream()
					.collect(Collectors.groupingBy(
							Function.identity(),
				           Collectors.counting()
				           
				           ));
	
					
					System.out.println(result);
	}
}
					
