package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class Map_1 {
	// 12. map()
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(
				"maruthi",
				"dhanvitha",
				"nagaraju",
				"nagarathna",
				"manula",
				"nani"
				
				);
		
		  names.stream()
		  .map(name -> name.toUpperCase())
		  .forEach(System.out::println);
	}

}
