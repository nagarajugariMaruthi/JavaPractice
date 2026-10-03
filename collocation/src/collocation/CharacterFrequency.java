package collocation;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String word =  "Programming";
		
		Map<Character, Integer> Map = new HashMap<>();
		
		
		for (char ch : word.toCharArray()) {
			
			if(Map.containsKey(ch)) {
				Map.put(ch, Map.get(ch) +1);
			} else {
				Map.put(ch, 1);
			}
		}
		
		System.out.println("Character Frequency : " + Map);
	}
}