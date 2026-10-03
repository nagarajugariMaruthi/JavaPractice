package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_15 {
	
	// 15. Find first element.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80);
		
		   int FirstElemets = list.stream()
				             .findFirst()
				             .get();
		   
		   System.out.println("First Element : " + FirstElemets);
	}

}
