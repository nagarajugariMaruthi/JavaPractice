package java8InterviewQuetion;

import java.util.function.Function;

public class Function_1 {
	
	// Function 
	
	public static void main(String[] args) {
	
	Function<Integer, Integer> f = Number -> Number * Number;
	
	 System.out.println(f.apply(5));
	 System.out.println(f.apply(10));
	 System.out.println(f.apply(110));
	}
}
