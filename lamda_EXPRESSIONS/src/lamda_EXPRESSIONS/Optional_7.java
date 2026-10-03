package lamda_EXPRESSIONS;

import java.util.Optional;

public class Optional_7 {
	
	// 7. Use orElseGet().
	public static void main(String[] args) {
		
		Optional<String> name = Optional.empty();
		
		String result = name.orElseGet(() ->"unknown");
		
		System.out.println("orElseGet : " + result);
	}

}
