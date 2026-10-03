package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. First Non-Repeated Character
		
		String str = "Programming";
		
		Map<Character, Integer> Map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
		
			Map.put(ch, Map.getOrDefault(ch, 0) + 1);
				
			}
		 for(char  Ch : str.toCharArray()) {
	
		
		 if(Map.get(Ch) ==1)  {
			 System.out.println(" First Non-Repeated Character: " + Ch);
			 break;
		 }
	}
}
}