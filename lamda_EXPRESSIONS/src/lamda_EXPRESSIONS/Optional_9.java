package lamda_EXPRESSIONS;

import java.util.Optional;
import java.util.Map;

public class Optional_9 {

// 9. Use Optional.map().
	
	public static void main(String[] args) {
		
		Optional<String> name = Optional.of("maruthi");
		
		Optional<String>  result = name.map(n-> n.toUpperCase());
		
		System.out.println(result);
	}

}
