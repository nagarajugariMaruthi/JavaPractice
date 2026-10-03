package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamApi_20 {
	
	// 20. Separate even and odd numbers.

	public static void main(String[] args) {
		
		List<Integer> list  = Arrays.asList(10,15,20,25,30,35,40,45,60,65,70,75);
		
		  List<Integer> EvenNumber = list.stream()
				    .filter(n -> n % 2 == 0)
				    .collect(Collectors.toList());
		  
		  List<Integer> oddNumber = list.stream()
				    .filter(n -> n % 2!=0)
				    .collect(Collectors.toList());
		  
		  System.out.println("EvenNumber : "  + EvenNumber);
		  System.out.println("oddNumber : " + oddNumber);
	}

}
