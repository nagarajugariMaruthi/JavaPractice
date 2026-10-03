package lamda_EXPRESSIONS;

import java.util.Arrays;

public class String_2 {
	
	//  2. Find unique characters.
	public static void main(String[] args) {
		
		String str = "Programming";
		
		Arrays.stream(str.split(""))
		   .filter(ch ->str.indexOf(ch)  == str.indexOf(ch))
		   .distinct()
		   .forEach(ch -> System.out.println(ch));
		
	}

}
