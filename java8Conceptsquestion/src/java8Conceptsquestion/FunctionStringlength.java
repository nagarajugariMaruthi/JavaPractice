package java8Conceptsquestion;

import java.util.function.Function;

public class FunctionStringlength {
	
	public static void main(String[] args) {
	
	Function<String, Integer> lenght =
			str -> str.length();
			
			int result = lenght.apply("Maruthilovedhanvitha");
			
			System.out.println("Length : " + result);  
}
}