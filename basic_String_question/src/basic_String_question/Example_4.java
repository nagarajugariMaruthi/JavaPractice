package basic_String_question;

import java.util.Scanner;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		
		// convert the uppercase 
		
		String upper = str.toUpperCase();
		
		// convert the lowercase 
		
		String lower = str.toLowerCase();
		
		System.out.println("Enter the String: " + str);
		System.out.println("Enter the upper: " + upper);
		System.out.println("Enter the lower: " + lower);
		
	
		sc.close();
	}
}