package lamda_EXPRESSIONS;


import java.util.Arrays;
import java.util.List;

public class StreamApi_5 {
	
	// 5. Find minimum number.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,40,30,50,60);
		
		  int min = list.stream()
				  .min(( a , b) -> a.compareTo(b))
				  .get();
				  System.out.println("Minimum number : " +min);
	}

}
