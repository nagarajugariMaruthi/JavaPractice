package lamda_EXPRESSIONS;

import java.util.Optional;

public class Optional_6 {
	
	// 6. Use orElse().

	public static void main(String[] args) {
		
		Optional<String> name = Optional.empty();
		
		  String result = name.orElse("unknow");
		  
		  System.out.println("orElse: " + result);
	}

}
