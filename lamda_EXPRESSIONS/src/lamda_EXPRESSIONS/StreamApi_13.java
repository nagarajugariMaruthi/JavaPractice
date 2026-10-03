package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_13 {
	
	// 13. Find second highest number.
	public static void main(String[] args) {
		
		List<Integer> list  = Arrays.asList(10,20,30,60,40,70,80,90);
		
		  int SecondHigtvalue = list.stream()
				               .distinct()
				               .sorted((a,b) -> b - a)
				               .skip(1)
				               .findFirst()
				               .get();
		  
		 System.out.println("Second Hight Number : " + SecondHigtvalue);
	}
}
				