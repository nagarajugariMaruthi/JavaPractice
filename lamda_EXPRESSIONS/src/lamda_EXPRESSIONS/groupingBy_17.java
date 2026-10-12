package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingBy_17 {
	
	// 17. groupingBy()
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
				"maruthi",
				"dhanvitha",
				"nagaraju",
				"manjula",
				"nagarathan",
				"sashi"
				);
		
		Map<Integer, List<String>> result = names.stream()
				 
				.collect(Collectors.groupingBy(name -> name.length()));
		
		System.out.println(result);
		
	}

}
