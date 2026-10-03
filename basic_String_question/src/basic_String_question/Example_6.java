package basic_String_question;

import java.util.Scanner;

public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Write a program to concatenate two strings.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Second String: ");
		String str2 = sc.nextLine();
		
		
		String result = str1.concat(str2);
		
		System.out.println("Concatinated String: " + result);
		
	
	sc.close();

	}
}