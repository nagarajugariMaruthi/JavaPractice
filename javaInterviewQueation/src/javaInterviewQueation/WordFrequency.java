package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. Word Frequency
		
		String str = "java is easy and Powerfull langauge";
		
		Map<String, Integer> map = new HashMap<>();
		
		String [] words = str.split(" ");
		
		for(String word : words ) {
			
			map.put(word, map.getOrDefault(words, 0) + 1);
		}

		System.out.println(map);
	}

}
