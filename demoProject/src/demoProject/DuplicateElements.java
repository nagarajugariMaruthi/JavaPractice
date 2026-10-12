package demoProject;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.List;

public class DuplicateElements {
	
	// Duplicate Arrasy Elemets
	
	public static void main(String[] args) {
		
		List<Integer> Number = Arrays.asList(
				10,20,10,20,30,40,50,40);
		
		   Set<Integer> seen = new HashSet<>();
		   
		   List<Integer> Duplicate = Number.stream()
				   .filter(num -> !seen.add(num))
				   .distinct()
				   .collect(Collectors.toList());
		   
		   System.out.println("Duplicate Number : " + Duplicate);
	}
}
	