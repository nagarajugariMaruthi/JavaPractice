package construcoter_referance;

import java.util.Arrays;
import java.util.List;

public class Example_006 {
	
	// 6. Iterate over Set using forEach().
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("JAVA,PYTHON, C++, SPRING BOOT , SPRING, SQL");
		
		list.forEach(x-> System.out.println(x.toLowerCase()));
	}
}