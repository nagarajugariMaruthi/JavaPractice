package basic_String_question;

import java.util.Scanner;

public class Example_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10. Write a program to convert a string into a character array.
       //String name="hari";
      //char[] array=name.toCharArray();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] array = str.toCharArray();
		
		System.out.println("characater array: " );
		
		for (char ch : array) {
			System.out.println(ch);
		}
	}
}
			
			