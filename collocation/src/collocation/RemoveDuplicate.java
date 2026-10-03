package collocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> Numbers = new ArrayList<>(
				Arrays.asList(10,20,30,10,20,40,50,40)
				
	);
		
		System.out.println("Orignale List : " + Numbers);
		
		Set<Integer> uniquNumbers = new LinkedHashSet<>(Numbers);
		
		List<Integer> result = new ArrayList<>(uniquNumbers);
		
		System.out.println("romve the Duplicate Numbers : " + result);
		
	}
}
	