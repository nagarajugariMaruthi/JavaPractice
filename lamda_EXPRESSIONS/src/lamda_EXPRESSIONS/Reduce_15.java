package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class Reduce_15 {
	// 15. reduce()
	public static void main(String[] args) {
		
		List<Integer> Number = Arrays.asList(10,20,60,60,70,90);
		
		  int sum = Number.stream()
				  .reduce(0,  (a,b) -> a +b);
		  
		  System.out.println(sum);
	}

}
