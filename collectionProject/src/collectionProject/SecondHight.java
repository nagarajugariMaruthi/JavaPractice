package collectionProject;

import java.util.*;

public class SecondHight {
	
	// 8. Find the second-highest distinct salary.
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		  map.put("maruthi", 50000);
		  map.put("dhanvitha", 60000);
		  map.put("nagaraju", 70000);
		  map.put("sahshi", 80000);
		  
		  int SecondHight = map.values()
				  .stream()
				  .distinct()
				  .sorted(Comparator.reverseOrder())
				  .skip(1)
				  .findFirst()
				  .get();
		  
		  System.out.println(" Second hight Salary : " + SecondHight);
	}
}
