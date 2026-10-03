package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Character Frequency
		
		String str = "Programming";
		
		Map<Character, Integer> Map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			
			Map.put(ch , Map.getOrDefault(ch, 0) + 1); 
			
			}
		System.out.println(Map);
		}
	}

		