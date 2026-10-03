package string.java.preactice;

import java.util.Arrays;

public class Anagram_String_Demo7 {
	    
	    public static void main(String[] args) {
	        
	        String str1 = "Listen";
	        String str2 = "silent";
	        
	        // Convert String to Lowercase
	        str1 = str1.toLowerCase();
	 
			str2 = ((String) str1).toLowerCase();
	        
	        // Conver String to character arrays
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        
	        // Sort array
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        
	        // copare Arrays
	    if(Arrays.equals(arr1,arr2)) {
	        System.out.println("String are Anagrams");
	    } else {
	        System.out.println("String are not Anagram");
	    }
	    }
	}
	    
