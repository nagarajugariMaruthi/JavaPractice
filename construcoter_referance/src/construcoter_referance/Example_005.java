package construcoter_referance;

import java.util.Arrays;
import java.util.List;

public class Example_005 {
	
	// 5. Print String elements in uppercase.
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("java, pyhton, spring boot, spring, c++, sql");
		
		list.forEach(x -> System.out.println(x.toUpperCase()));

	}
}