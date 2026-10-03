package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.stream.Collectors;

public class String_7 {
	
	// 7. Reverse each word.
	
	public static void main(String[] args) {
		
		String str = " i love you so mush dhanvitha";
		
		String  result = Arrays.stream(str.split(" "))
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(java.util.stream.Collectors.joining());
		
		System.out.println(result);
	}

}
