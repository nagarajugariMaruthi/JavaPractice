package basic_String_question;

import java.util.Scanner;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. Write a program to find the length of a string.
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the String length");
		String str = sc.nextLine();
		
	int length = str.length();
	
	System.out.println("length of String " +length);
	
	sc.close();

	}

}
