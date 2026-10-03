package lamda_EXPRESSIONS;

import java.util.Optional;

public class Optional_5 {
	
	// 5. Use ifPresent(
	
	public static void main(String[] args) {
		
		Optional<String> name = Optional.of("Maruthi");
		
		name.ifPresent(n-> System.out.println("name: " + n));
	}
}
