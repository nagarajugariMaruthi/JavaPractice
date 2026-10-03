package construcoter_referance;

import java.util.HashMap;
import java.util.Map;

public class Example_007 {
	
	// 7. Iterate over Map using forEach().
//map.forEach((k,v) ->
   // System.out.println(k + " " + v));
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,"Java");
		map.put(2, "Python");
		map.put(3, "Spring boot");
		map.put(3, "C++");
		
		map.forEach((k,v) -> 
		
		System.out.println(k + " " + v));
	}
}