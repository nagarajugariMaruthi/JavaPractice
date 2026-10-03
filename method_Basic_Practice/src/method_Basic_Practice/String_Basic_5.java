package method_Basic_Practice;

import java.util.Scanner;

public class String_Basic_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 //  Write a program to check if a string is empty or not.
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String text = sc.nextLine();
		
		if(text.isEmpty()) {
		System.out.println("the String isEmpty"); 
		}  else { 
			System.out.println("the String is Not isEmpty");
		}
		
  sc.close();
  
	}
}