package collectionProject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Groupwordsbytheirlength {
	
	// 14. Group words by their length.
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList(
				"java",
				"sql",
				"python",
				"database",
				"oracle",
				"spring boot",
				"spring",
				"java8",
				"j2ee",
				"microservice"
			);
		
		   Map<Integer, List<String>> result = words.stream()
				   .collect(Collectors.groupingBy(String::length));
		   
		   System.out.println(result);
	}
}