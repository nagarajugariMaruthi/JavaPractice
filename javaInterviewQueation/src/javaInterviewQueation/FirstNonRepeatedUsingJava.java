package javaInterviewQueation;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedUsingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Programming";
		
		Character result = str.chars()
		.mapToObj(c -> (char) c) 
		.collect(Collectors.groupingBy(
		Function.identity(), 
		java.util.LinkedHashMap::new, 
		Collectors.counting()
		
				)) 
		.entrySet() 
		.stream() 
		.filter(entry -> entry.getValue() == 1) 
		.map(Map.Entry::getKey) .findFirst() 
		.orElse(null); 
		
		System.out.println("First Non-Repeated Character: " + result); 
	}
}

