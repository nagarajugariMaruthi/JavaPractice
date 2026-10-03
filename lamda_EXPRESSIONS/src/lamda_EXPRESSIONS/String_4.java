package lamda_EXPRESSIONS;

import java.util.Arrays;

public class String_4 {
	
	// 4. Find first non-repeated character.
	public static void main(String[] args) {
		
		String str = "Programming";
		
		String result = Arrays.stream(str.split(""))
				.filter(ch -> str.indexOf(ch) ==str.lastIndexOf(ch))
				.findFirst()
				.orElse(null);
			
		System.out.println(result);
	}

}
