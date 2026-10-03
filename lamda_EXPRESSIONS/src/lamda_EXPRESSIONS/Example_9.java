package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class Example_9 {
	
	// 9. Sort List using Lambda.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(50,10,30,20,40,50);
		
		list.sort((a,b) -> a -b);
		
		System.out.println(list);
	}

}
