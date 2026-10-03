package java8Conceptsquestion;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> isEven = number -> number % 2 == 0;
		
		int number = 20;
		
		if(isEven.test(number)) {
			System.out.println(number + "is Even : ");
			
		} else {
			System.out.println(number + "is odd ");
			
		}
			
		}

	}
