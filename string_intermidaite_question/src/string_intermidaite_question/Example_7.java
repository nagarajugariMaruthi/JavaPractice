package string_intermidaite_question;

import java.util.Arrays;
import java.util.Scanner;
public class Example_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Write a program to check if two strings are anagrams.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("the First String ");
		String str1 = sc.nextLine();
		
		System.out.println("the second String ");
		String str2 = sc.nextLine();
		
		
	    str1 = 	str1. toLowerCase();
	    str2 =	str2.toLowerCase();
	    
	    if(str1.length() !=str2.length()) {
	    	System.out.println("the String not Anagram ");
	    	
	    } else {
	    	
	    char[] arr1 = str1.toCharArray();
	    char[] arr2 = str2.toCharArray();
	    
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    
	    if(Arrays.equals(arr1,arr2)) {
	    	System.out.println("the String Anagram ");
	    } else {
	    	System.out.println("the String or not Anagram ");
	    }
	    
	    sc.close();
	    }
	}
}