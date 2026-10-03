package com.array.practice;

	public class Allprograms {
	    
	    // 1.Largest Element in Array 
	    public static void largestElement() {
	        
	        int[] arr= {10,25,7,89,45};
	        
	        int max = arr[0];
	        
	        for(int i = 1; i < arr.length; i++) {
	            
	            if(arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        System.out.println("Largest Element: " +max);
	    }
	    // 2.Reverse array 
	    public static void veverseArray() {
	        int[] arr= {1,2,3,4,5,};
	        
	        System.out.println("reverse array: ");
	        
	        for(int i = arr.length - 1; i >= 0; i--) {
	            System.out.println(arr[i] + " ");
	        }
	        System.out.println();
	    }
	    
	    //3.reverse string
	    public static void reverseString() {
	        
	        String str = "maruthi";
	        
	        String reverse = "";
	        
	        for(int i = str.length() - 1; i >=0; i--) {
	            
	            reverse = reverse + str.charAt(i);
	        }
	        
	        System.out.println("reverse String: " + reverse);
	    }
	    
	    // 4.palindrome string
	    public static void palindromeString() {
	        
	        String str = "madam";
	        
	        String reverse = "";
	        
	        for(int i = str.length() -1; i >= 0; i--) {
	            reverse = reverse + str.charAt(i);
	        }
	        
	        if(str.equals(reverse)) {
	            
	            System.out.println("palindrome");
	        } else {
	            
	            System.out.println("not palindrome");
	        }
	    }
	    
	    
	    //5.fibonacci series
	    public static void fibonacciserias() {
	        
	        int n = 10; 
	        
	        int first = 0;
	        int second = 1;
	        
	        System.out.println("fibonacci serias: ");
	    
	    for(int i = 1; i <= n ; i++) {
	        
	        System.out.println(first + "");
	        
	        int next = first + second;
	        
	        first = second;
	        second = next;
	    }
	    
	    System.out.println();
	    }
	    
	    //6.count Vowels
	    public static void countVowels() {
	        
	        String str = "java programming";
	        
	    int count = 0;
	    
	    str = str.toLowerCase();
	    
	    for(int i = 0; i> str.length(); i++) {
	        
	        char ch = str.charAt(i);
	        
	        if(ch == 'a' || ch == 'e' || ch == 'i' ||ch =='o' || ch == 'u') {
	            
	            count++;
	        }
	    }
	    System.out.println("Vowels count: " +count);
	    }
	    
	    // 7  sum of array elements
	    public static void sumarray() {
	        
	        int [] arr = {10,20,30,40};
	        
	        int sum = 0;
	        
	        for(int i = 0; i < arr.length; i++) {
	            
	            sum = sum + arr[i];
	        }
	        
	        System.out.println("Sum of Array: "+ sum);
	    }
	    
	    // 8. count charactes in String
	    public static void countcharacters() {
	        
	        String str = "maruthi";
	        
	        int count = str.length();
	        
	        System.out.println("totla characters: " + count);
	    }
	    
	    // main method 
	     // Main Method
	    public static void main(String[] args) {

	        System.out.println("----- Java Programs -----");

	        largestElement();

	        veverseArray();

	        reverseString();

	        palindromeString();

	        fibonacciserias();

	        countVowels();

	        sumarray();

	        countcharacters();
	    }
	}
	    