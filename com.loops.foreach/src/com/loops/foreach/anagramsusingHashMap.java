package com.loops.foreach;

import java.util.*;


public class anagramsusingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = {"eat", "tea", "tan", "ate" ,"nate" , "bat"};
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String word : words) {
			
			char[] Chars = word.toCharArray();
			
			Arrays.sort(Chars);
			
			String key = new String(Chars);
			
		    // Add word to the corresponding group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        System.out.println(map.values());
    }
}