package lamda_EXPRESSIONS;

import java.util.Optional;

public class Optionale_2 {
	
	// 
	// 2. Create Optional using Optional.ofNullable().


	
	public static void main(String[]args) {
		
		String name = null;
		
		Optional<String> obj = Optional.ofNullable(name);
		
		System.out.println(name);
	}

}
