package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4. Unique Characters
		
		String str = "Programming";
		
		Map<Character, Integer> Map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			
			Map.put(ch,  Map.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(" Unique Characters: " );
	

	for(Map.Entry<Character, Integer> entry : Map.entrySet()) {
		
		if(entry.getValue() >1) {
			System.out.println(entry.getKey());
		}
	}
}
}