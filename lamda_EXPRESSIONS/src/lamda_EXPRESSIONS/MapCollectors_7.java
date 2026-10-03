package lamda_EXPRESSIONS;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MapCollectors_7 {
	
	// 7. Convert Map values into List.
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		    map.put(1, "maruthi");
		    map.put(2, "nagaraju");
		    map.put(3, "dhanvitha");
		    map.put(4,   "swamy");
		    map.put(5, "sridevi");
		    
		    List<String> values = map.values()
		    		.stream()
		    		.collect(Collectors.toList());
		    
		    System.out.println(values);
	}
}
