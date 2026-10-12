package collectionProject;

import java.util.*;

public class HightSalary {
	
	// 6. Find the highest-paid employee.
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		    map.put(50000, "maruthi");
		    map.put(1000, "dhanvitha");
		    map.put(7000, "nagaraju");
		    map.put(60000, "Nagarathan");
		    
		   Map.Entry<Integer, String> HightSalary = map.entrySet()
				   .stream()
				   .max(Map.Entry.comparingByValue())
				   .get();
		   
		   System.out.println(HightSalary.getKey() + " : " +HightSalary.getValue());
	}
}
