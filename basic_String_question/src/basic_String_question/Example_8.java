package basic_String_question;

import java.util.Scanner;

public class Example_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/// 8. Write a program to find the character at a specific index in a string.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Enter the index ");
		int index = sc.nextInt();
		
		if(index >=0 && index < str.length()) {
			
			char ch = str.charAt(index);
			
			System.out.println("characater at index " +index+ "=" + ch);
		} else {
			System.out.println("invalid index!");
		}
		
		sc.close();
	}
}
	