package stringInterview_imp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Example_anagram_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How to check if two strings are anagrams?[str1->CAB-> ABC, str2-> BAC--> ABC]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First String ");
		String str1 = sc.nextLine().toLowerCase();
		
		System.out.println("Second String ");
		String str2 = sc.nextLine().toLowerCase();
		
		
		if(str1.length() != str2.length()) {
			
			System.out.println("Not anagram ");
			
		} else {
			
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2 )) {
				
				System.out.println("String is anagram ");
			} else {
          System.out.println("String is not anagram");
		}
	}
	
	sc.close();
}
}
	