package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_4 {
	
	// 4. Find maximum number.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,50,60,80,20,30,55);
		
		int max = list.stream()
				  .max((a, b) -> a.compareTo(b))
		          .get();
		          
		          System.out.println("maximum : " + max);
	}

}
