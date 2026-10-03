package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_6 {

	// 6. Count word frequency.
	
	public static void main(String[] args) {
		
		String str  = " i love you so mush dhanvitha dhanvitha ";
		
		Map<String, Long> result = Arrays.stream(str.trim().split("\\s+"))
		        .collect(Collectors.groupingBy(
		                Function.identity(),
		                Collectors.counting()
		        ));
		
		System.out.println(result);
}
}