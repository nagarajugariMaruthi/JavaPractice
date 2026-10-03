package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class String_10 {
	
	// //10. Group Strings based on length.
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"java", "python", "C++", "c", "Automationtesting", "Selenium", "Manual testing" ,"SQL"
				
				);
		
		Map<Integer,List<String>> result = list.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(result);
	}
}
	