package javaInterviewQueation;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 9. Remove Duplicate Characters

		String str = "Programming";
		
		Set<Character> Set = new HashSet<>();
		
		StringBuilder result = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			
			if(Set.add(ch)) {
				result.append(ch);
			}
		}
		
		System.out.println("Original String : " + str);
		System.out.println(" after Remove Duplicate Character : " + result);
	}
			}