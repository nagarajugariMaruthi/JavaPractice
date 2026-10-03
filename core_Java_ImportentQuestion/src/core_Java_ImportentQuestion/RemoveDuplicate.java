package core_Java_ImportentQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5. Remove duplicate characters from a String.
		
		String str = "Programming";
		
		Set<Character> Set = new LinkedHashSet<>();
		
		for(char ch : str.toCharArray()) {
			
			Set.add(ch);
		}
		
		String result = " ";
		
		for(char ch : Set) {
			
			result = result + ch;
		}
		
		System.out.println("Original String : " + str);
		System.out.println("Affter remove String : " + result);
	}
}
