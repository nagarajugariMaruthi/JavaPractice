package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_8 {
	
	// 8. Sort numbers ascending.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,50,30,20,40,80,70);
		
		  list.stream()
		  .sorted()
		  .forEach(n-> System.out.println(n));
	}

}
