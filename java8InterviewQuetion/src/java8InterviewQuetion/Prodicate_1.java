package java8InterviewQuetion;

import java.util.function.Predicate;

public class Prodicate_1 {
	
	// 2. Predicate 
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = Number -> Number > 10;
		
		System.out.println(p.test(20));
		System.out.println(p.test(10));
	}

}
