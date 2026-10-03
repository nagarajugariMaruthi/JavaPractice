package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class StreamApi_14 {
	
	// 14. Find second lowest number.
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,5,20,30,40,50,60,70);
		
		  int secondlowest = list.stream()
				           .distinct()
				           .sorted((a,b) -> a -b)
				           .skip(1)
				           .findFirst()
				           .get();
		  
		  System.out.println("secondLowest : " + secondlowest);
	}
}
