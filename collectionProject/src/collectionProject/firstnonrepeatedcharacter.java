package collectionProject;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstnonrepeatedcharacter {
	
	// 13. Find the first non-repeated character in a strin
	public static void main(String[] args) {
		
		String str = "maruthilovedhanvitha";
		
		Character result = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
			    Function.identity(),
			    Collectors.counting()
			    
			    ))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.get();
		
		System.out.println("Frist non repeative characters : " + result);
	}
}
				
