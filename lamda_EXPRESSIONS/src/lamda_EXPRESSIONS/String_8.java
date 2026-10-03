package lamda_EXPRESSIONS;

import java.util.Arrays;

public class String_8 {
	
	// 8. Find longest String.
	public static void main(String[] args) {
		
		String str = " i love you java Programming ";
		
		 String result = Arrays.stream(str.split(" "))
				 .max((s1,s2) -> Integer.compare(s1.length(),s2.length()))
				  .orElse(null);
		 
		 System.out.println(result);
	}

}
