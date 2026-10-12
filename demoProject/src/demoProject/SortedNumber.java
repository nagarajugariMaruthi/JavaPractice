package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumber {
	
	public static void main(String[] args) {
		
		List<Integer> Number = Arrays.asList(50,20,10,40,30);
		
		  List<Integer> acendingorder= Number.stream().sorted().collect(Collectors.toList());
		  
		  System.out.println("acendingorder : " + acendingorder);
	}

}
