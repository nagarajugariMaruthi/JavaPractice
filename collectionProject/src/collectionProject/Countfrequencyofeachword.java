package collectionProject;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countfrequencyofeachword {
	
	// 11. Count the frequency of each word.
	
	public static void main(String[] args) {
		
		List<String> word = Arrays.asList(
				
				"java",
				"python",
				"c++",
				"core java",
				"sql",
				"database",
				"sql"
				
				);
		
		Map<String, Long> frequency = word.stream()
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()
						
						));
		
		System.out.println(frequency);
	}
}
