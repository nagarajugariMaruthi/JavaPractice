package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class Forexample {
	//           ↓
	// 13. sorted()
    public static void main(String[] args) {
    	
    	List<Integer> number = Arrays.asList(50,60,30,40,20,10);
    	
    	   number.stream()
    	   .sorted()
    	   .forEach(System.out::println);
    }

}
