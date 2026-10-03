package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class Stream_2 {
	
	// 2. Find odd numbers from List.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,25,35,45,55);
		
		list.stream()
		.filter(n -> n % 2!=0)
		.forEach(n-> System.out.println(n));
	}

}
