package lamda_EXPRESSIONS;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class mapCollection_2 {
	
	// 2. Sort Map based on keys.
	
	public static void main(String[] args) {
		
		Map<Integer, String> map  = new HashMap<>();
		
		map.put(1, "maruthi");
		map.put(2, "nagaraju");
		map.put(3, "manjula");
		map.put(4, "vannur swamy");
		map.put(5, "sashikumar");
		
		map.entrySet()
		   .stream()
		    .sorted(Map.Entry.comparingByKey())
		    .forEach(entry ->
		    System.out.println((entry.getKey() + " " + entry.getValue())));
	}
}
