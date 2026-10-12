package lamda_EXPRESSIONS;

import java.util.Optional;

public class optional_19 {
	 
	//19. Optional
	
	public static void main(String[] args) {
		
		String name = "maruthi";
		
		Optional<String> optional = Optional.of(name);
		
		if(optional.isPresent()) {
			
			System.out.println(optional.get());
		}
		
	}


}
