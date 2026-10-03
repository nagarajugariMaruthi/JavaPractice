package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_16 {
	
	// 16. Count List elements.
	
	public static void main(String[] args) {
		
		List<Integer> List = Arrays.asList(10,20,30,40,50,60,70,80);
		
		 long count  = List.stream()
				    .count();
		 
		 System.out.println("Count Elements : " + count);
	}

}
