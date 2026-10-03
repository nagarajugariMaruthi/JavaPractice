package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_9 {
	
	//9. Sort numbers descending.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70);
		
		list.stream()
		.sorted((a, b) -> b - a)
		.forEach(n-> System.out.println(n));
	}

}
