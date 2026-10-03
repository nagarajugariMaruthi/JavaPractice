package lamda_EXPRESSIONS;

import java.util.Arrays;

public class String_1 {
 
	// 1. Find duplicate characters in String.
	public static void main(String[] args) {
		
		String str = "Programming";
		
		Arrays.stream(str.split(""))
		      .filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch))
		      .distinct()
		      .forEach(ch-> System.out.println(ch));
	}
}
