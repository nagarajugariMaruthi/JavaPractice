package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_17 {
	
	// 17. Skip first 5 elements.
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80);
		
		
		   list.stream()
		    .skip(5)
		    .forEach(n->System.out.println(n));
	
		    
	}

}
