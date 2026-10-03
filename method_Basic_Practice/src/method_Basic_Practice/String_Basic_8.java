package method_Basic_Practice;

import java.util.Scanner;
public class String_Basic_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  // 8. Write a program to find the character at a specific index in a string.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String text = sc.nextLine();
		
		System.out.println("Enter the Index String: ");
		int index = sc.nextInt();
		
	
		if (index >= 0 && index < text.length()) {
			char ch = text.charAt(0);
		 System.out.println("Character Index" + index + "is" +ch);
		} else {
			System.out.println("Invalid index!");
		}
		sc.close();
		}
}