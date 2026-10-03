package com.practice.java;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/// check if a number is a vowel or consonant 
         char ch = 'a';
         //ch = Character.toLowerCase(ch);
        ch = Character.toLowerCase(ch);
        if(ch =='a' || ch =='e'|| ch =='i'|| ch == 'o' || ch =='e') {
        	System.out.println("it is vowel");
        } else if (ch >= 'a' && ch <= 'z') {
        	System.out.println("it is a consonant");
        } else {
        	System.out.println("not is alphabets");
        	
        }
         
	}

}
