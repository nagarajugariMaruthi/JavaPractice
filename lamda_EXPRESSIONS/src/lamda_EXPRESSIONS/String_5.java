package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.function.Function;
import java.util.Map;
import java.util.stream.Collectors;

public class String_5 {
	
	// 5. Count character frequency.
	
	public static void main(String[] args) {
	
	String str = "Programming";
	
	Map<String, Long> result = Arrays.stream(str.split(""))
			.collect(Collectors.groupingBy(
					Function.identity(),
					Collectors.counting()
					
					));

    System.out.println(result);
}
}