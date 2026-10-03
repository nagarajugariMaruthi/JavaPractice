package methods_Question;

import java.util.Arrays;
import java.util.List;

public class Example_5 {
	//5. Convert Strings to uppercase using:
// String::toUpperCase
	
	public static void main(String[] args) {
	
	List<String> list = Arrays.asList(
			"maruthi", "dhanvith", "vamshi", "sashi", "nagarathan"
			
			);

	 list.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
}
}