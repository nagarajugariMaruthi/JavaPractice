package lamda_EXPRESSIONS;

import java.util.HashMap;
import java.util.Map;

public class MapCollection_3 {
	
	// 4. Find maximum Map value.

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		    map.put(1, 45);
		    map.put(2, 18);
		    map.put(3, 22);
		    map.put(4,  111);
		    map.put(5,  35);
		    
		    int maxvalue = map.values()
		    		   .stream()
		    		   .max(Integer::compare)
		    		   .get();
		    
		    System.out.println("maxivalue :" + maxvalue);
	}
}
		    		        