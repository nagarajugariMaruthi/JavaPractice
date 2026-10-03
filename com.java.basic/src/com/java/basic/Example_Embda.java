package com.java.basic;

  @FunctionalInterface
interface Palindrome  {
	boolean check(String str);
}

public class Example_Embda {
	
	public static void main(String[] args) {
		
		Palindrome Palindrome =  str -> str.equals(new StringBuilder(str).reverse().toString());
		
		boolean result = Palindrome.check("madam");
		
		if(result) {
			System.out.println("Palindrome");
		} else {
			System.out.println("is not palindrome");
		}
		}
	}
