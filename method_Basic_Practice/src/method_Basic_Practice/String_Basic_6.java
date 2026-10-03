package method_Basic_Practice;

import java.util.Scanner;
public class String_Basic_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 // Write a program to concatenate two strings.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the First String: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Second String: ");
		String str2 = sc.nextLine();
		
		String result = str.concat(str2);
		
	System.out.println("Concanated  String: " + result);
	
	sc.close();
	}
}
		