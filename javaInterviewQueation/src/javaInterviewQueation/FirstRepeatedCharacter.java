package javaInterviewQueation;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6 First Repeated Character
 
		String str = "Programming";
		
		Set<Character> Set = new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			
	   if(Set.contains(ch)) {
		   System.out.println(" First Repeated Character : " + ch);
		   break;
	   }
		   
	   Set.add(ch);
	   }
	}
}