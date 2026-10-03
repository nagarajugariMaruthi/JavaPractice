package core_Java_ImportentQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindNonrepeativecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3. Find the first non-repeated character in a String.
		
		String str = "Swippis";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			
			map.put(ch, map.getOrDefault(ch, 0) +1);
		}
		
		 // Find first character with count 1
		
		for(Entry<Character, Integer> entrey : map.entrySet()) {
		
			
			if(entrey.getValue() == 1) {
				System.out.println("First Non repeatice characters : " + entrey.getValue());
				break;
			}
		}
	}
}