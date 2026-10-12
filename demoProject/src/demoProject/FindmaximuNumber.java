package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindmaximuNumber {

	// ### 3. Find the maximum number in a list
	
	public static void main(String[] args) {
		
		List<Integer> Numbers = Arrays.asList(10,20,40,50,60,70,80,100);
		
		
		  Optional<Integer> maxnumber = Numbers.stream().max(Integer::compareTo);
		  
		 maxnumber.ifPresent(num ->
		 
		 System.out.println("maximimum Number : " + num));
	}
}
