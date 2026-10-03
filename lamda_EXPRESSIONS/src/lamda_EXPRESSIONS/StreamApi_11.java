package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class StreamApi_11 {
	
	// 11. Find duplicate numbers.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,10,40,20,50,60,50,70);
		
		  Set<Integer> set = new HashSet<>();
		  
		  list.stream()
		  .filter(n-> !set.add(n))
		  .forEach(n -> System.out.println(n));
		  
		
	}

}