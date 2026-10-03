package core_Java_ImportentQuestion;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6. Find duplicate characters in a String.
		
		String str = "Programming";
		
		Map<Character, Integer> Map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			
		Map.put(ch, Map.getOrDefault(ch, 0) + 1); 
			
		}
		
		for(Map.Entry<Character, Integer> entry : Map.entrySet()) {
			
			if(entry.getValue() > 1) {
				
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}
	}
}