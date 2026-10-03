package collocation;

import java.util.HashSet;
import java.util.Set;

public class CheckElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> Programming = new HashSet<>();
		
		Programming.add("java");
		Programming.add("Python");
		Programming.add("Java Script");
		Programming.add("C++");
	    Programming.add("devopes");
	    
	    
	    if(Programming.contains("Python")) {
	    	System.out.println("Python is present in the set  ");
	    } else {
	    
	    	System.out.println("Pyhton is not present in the set : ");
	    }

	}

}
