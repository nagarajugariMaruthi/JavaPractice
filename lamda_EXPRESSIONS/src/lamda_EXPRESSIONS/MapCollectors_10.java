package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCollectors_10 {
	
	// 10. Group List elements using groupingBy().
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
				
				"Maruthi",
				"dhanvitha",
				"sony",
				"nagaraju",
				"manjula",
				"nagarathan",
				"nani",
				"ammu",
				"sashi",
				"marakka"
				
				);
    
		Map<Integer, List<String>> result  = names.stream()
				.collect(Collectors.groupingBy(
						name -> name.length()
						));
						
						System.out.println(result);
	}
}
				