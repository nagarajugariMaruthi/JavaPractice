package method_Basic_Practice;

import java.util.Scanner;
public class String_Basic_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  Write a program to find the length of a string.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String Length : ");
		String text = sc.nextLine();
		
		
		int length = text.length();
	
		
		System.out.println("String length " + length);
		
		sc.close();
	}
}
