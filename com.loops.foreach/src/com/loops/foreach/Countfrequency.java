package com.loops.foreach;

import java.util.HashMap;
import java.util.Map;

public class Countfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Count frequency of words.
		
		String str  = "java is a easy and Power full language";
		
		 String[] words = str.split(" ");
		 
		 Map<String, Integer> map  = new HashMap<>();
	
		 for(String word : words) {
			 map.put(word, map.getOrDefault(words, 0) + 1); 
			 }
			 
			 System.out.println(map);
			 }
				 
			 }
		 