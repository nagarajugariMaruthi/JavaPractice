package lamda_EXPRESSIONS;

import java.util.Optional;

public class Optional_8 {
	
	// 8. Use orElseThrow().
	
	public static void main(String[] args) {
		
		Optional<String> name = Optional.of("Maruthi");
		
		  String result = name.orElseThrow();
		  
		  System.out.println("orElsethrow: " + result);
		
	}

}
