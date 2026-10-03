package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.stream.Collectors;

public class String_9 {
	
	// 9. Convert Strings to uppercase.
	
	public static void main(String[] args) {
		
		String str = " i love you so mush  dhanvitha";
		
		String result = Arrays.stream(str.split(""))
				.map(String::toUpperCase)
                .collect(Collectors.joining(""));
                
                System.out.println(result);
	}

}
