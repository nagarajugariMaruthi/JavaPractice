package java8Conceptsquestion;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class FelterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3. Using `Predicate<String>`, filter Strings whose **length is greater than 5**.

		List<String>  names = Arrays.asList(
			"java",
			"Maruthi", 
			"Spring",
			"Sql",
			"Developer"
			);
		
		Predicate<String> lengthcheck =
				
				str -> str.length() > 5;
				
				names.stream()
	             .filter(lengthcheck)
	             .forEach(System.out::println);
	    }
	}		// TODO Auto-generated method stub