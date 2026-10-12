package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		
		List<Integer> Numbers = Arrays.asList(10,20,15,30,35,40,45,50,60,75);
		
		  List<Integer>Evennumber= Numbers.stream()
				  .filter(num -> num % 2 ==0) 
				  .collect(Collectors.toList());
		  
		  System.out.println(Evennumber);
	}

}
