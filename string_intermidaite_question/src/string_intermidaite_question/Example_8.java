package string_intermidaite_question;

import java.util.Scanner;
public class Example_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to swap two strings without using a third variable.
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" the First String: ");
		String str1 = sc.nextLine();
		
		System.out.println("the Second String: ");
		String str2 = sc.nextLine();
		
		str1 = str1+str2;
		// Extract the First String 
		
		str2 = str1.substring(0, str1.length() - str2.length());
		
		// Extract the Second String 
	    str1=str1.substring(str2.length());
	    
	    System.out.println("After the sawp ");
	    System.out.println("first String swap: " + str1);
	    System.out.println("the second String swap: " + str2);
	
	    sc.close();
	}
}
