package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7. Maximum Occurring Character
		
		String str = "Programming";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			
			map.put(ch,map.getOrDefault(ch , 0) +1);
		}
		
		char maxchar = ' ';
		int maxcount  = 0;
		
		for(char ch : str.toCharArray()) {
			
			if(map.get(ch) > maxcount) {
				maxcount = map.get(ch);
				maxchar = ch;
			}
		}
		
		System.out.println(" Maximum char Occurring Character : " + maxchar);
		System.out.println(" Maximum count Occurring Character : " + maxcount);
	}
}
			