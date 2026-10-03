package basic_String_question;

import java.util.Scanner;

public class Example_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program to check if a string contains a given substring. "hello".contains("o")

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the SubString: ");
		String sub = sc.nextLine();
	
		
		if(str.contains(sub)) {
			System.out.println("SubString is prasent: ");
		} else {
			System.out.println("SubString is not prasent: ");
		}
			
			sc.close();
		}
	}
