package java8Conceptsquestion;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class gretterthen5integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(5,20,30,40,25,50,60,70);
		
		  Predicate<Integer> rangechek = 
				  
				  num -> num > 10 && num < 50;
				  
				  numbers.stream()
						  .filter(rangechek)
						   .forEach(System.out::println);

	}

}
