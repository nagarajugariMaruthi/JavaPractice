package lamda_EXPRESSIONS;

import java.util.HashMap;
import java.util.Map;

public class MapCollectors_8 {
	
	// 8. Filter Map using Stream.
	public static void main(String[] args) {
		
		Map<Integer, String> Employee = new HashMap<>();
		
		Employee.put(10000, "dhanvitha");
		Employee.put(50000, "maruthi");
		Employee.put(60000, "sony");
		Employee.put(80000, "nagaraju");
		Employee.put(90000, "swamy");
		
		Employee.entrySet()
		      .stream()
		      .filter(entry -> entry.getKey() > 50000)
		      .forEach(entry ->
		      System.out.println(entry.getKey() + " " + entry.getValue()));
	}
}
