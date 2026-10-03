package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is easy and java Powerfull language";
		
		String[] words = str.toLowerCase().split("\\s+");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : words) {
			
		map.put(word, map.getOrDefault(word, 0) + 1);
		}			
	System.out.println("Duplicate words ");
	for(Map.Entry<String, Integer> entry : map.entrySet()) {
		
	 if (entry.getValue() > 1) {
		 System.out.println(entry.getKey() + " = " + entry.getValue());
	 }
	}
}
}