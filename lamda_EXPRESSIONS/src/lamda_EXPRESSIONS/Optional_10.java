package lamda_EXPRESSIONS;

import java.util.Optional;

public class Optional_10 {

	//10. Handle null values without NullPointerExceptional
	
	public static void main(String[] args) {
		
		String name = null;
		
		Optional<String> result = Optional.ofNullable(name);
		
		String value = result.orElse("Unknown");
		
		System.out.println(" Name: "+ value);
	}
}
	