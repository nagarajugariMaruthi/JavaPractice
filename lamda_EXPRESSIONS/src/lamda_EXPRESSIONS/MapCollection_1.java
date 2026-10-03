package lamda_EXPRESSIONS;

import java.util.HashMap;
import java.util.Map;
public class MapCollection_1 {
	
	// 1. Iterate Map using forEach().
	
	public static void main(String[] args) {
		
		Map<Integer, String > map = new HashMap<>();
		
		   map.put(105, "maruthi");
		   map.put(110,  "dhanvitha");
		   map.put(120,  "nagaraju");
		   map.put(115,  "sahshikumar");
		   
		   map.forEach((key, value) ->
		   System.out.println(key + " " + value));
	}

}
