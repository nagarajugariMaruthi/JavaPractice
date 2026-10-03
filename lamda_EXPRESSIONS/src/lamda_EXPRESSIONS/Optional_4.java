package lamda_EXPRESSIONS;

import java.util.Optional;

public class Optional_4 {
	
	// 4. Check value using isPresent().
	
	public static void main(String[] args) {
		
		Optional<String> name = Optional.of("Maruthi");
		
		if(name.isPresent()) {
			System.out.println(" value is Present : " + name.get());
		}
	}

}
