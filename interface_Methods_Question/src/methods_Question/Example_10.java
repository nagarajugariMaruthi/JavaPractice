package methods_Question;

import java.util.Arrays;
import java.util.List;

public class Example_10 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				
				"Maruthi", "Dhanvitha", "Sunil", "Nagarathana", "Nagaraju"
				);
		
		list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out::println);
	}

}
