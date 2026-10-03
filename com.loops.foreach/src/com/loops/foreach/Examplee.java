package com.loops.foreach;

import java.util. LinkedHashMap;
import java.util.Map;

public class Examplee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Programming";
		
		Map<Character, Integer> map = new  LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			
		}
	
		for(char ch : str.toCharArray()) {
		
			if(map.get(ch) ==1) {
				System.out.println("Non repeative character ch = " + ch);
				break;
			}
		}
	}
}
