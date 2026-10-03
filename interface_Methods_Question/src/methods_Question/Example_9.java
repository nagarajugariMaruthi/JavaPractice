package methods_Question;

import java.util.function.BiPredicate;

public class Example_9 {
	
	public static void main(String[] args) {
		
		BiPredicate<String,String> check = String::equals;
		
		System.out.println(check.test("maruthi", "maruthi"));
		System.out.println(check.test("maruthi", "sunil"));
	}

}
