package collectionProject;


import java.util.*;

public class topthreesalaries {
	
	// 9. Find the top three distinct salaries.
	public static void main(String[] args) {
		
		Map<String, Integer> map  = new HashMap<>();
		
		   map.put("maruhti", 2000);
		   map.put("dhanvitha", 5000);
		   map.put("nagaraju", 6000);
		   map.put("nagarathan", 1000);
		   map.put("sashi", 1200);
		   
		   map.values()
		   .stream()
		   .distinct()
		   .sorted(Comparator.reverseOrder())
		   .limit(3)
		   .forEach(System.out::println);
	}
}
