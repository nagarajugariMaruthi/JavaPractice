package methods_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example_4 {
	// Use System.out::println with forEach().
 ///list.forEach(System.out::println);
 
	public static void main(String[] args) {
		
		List<String> List = Arrays.asList("Maruhti ", "dhanviht", "Nagarathan", "Eswar Nani", "sashi");
		
		List.forEach(System.out::println);
	}


}
