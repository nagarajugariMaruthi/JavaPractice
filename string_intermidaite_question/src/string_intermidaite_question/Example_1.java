package string_intermidaite_question;

import java.util.Scanner;
public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to reverse a string without using StringBuilder
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the StringBuilder: ");
		String text = sc.nextLine();
		
		
		for (int i = text.length() -1; i >= 0; i--) {
			
			System.out.println(text.charAt(i));
		}
		sc.close();
	}
}
