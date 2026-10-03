package string_intermidaite_question;

import java.util.Scanner;
public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String text = sc.nextLine();
	
		String reverse = "";
		// Reverse String 
		for (int i = text.length() -1; i >=0; i--) {
			
			 reverse = reverse + text.charAt(i);
		}
	
			 /// chekc if the  String is original or not 
	  if(text.equals(reverse)) {
		  System.out.println("the String is palindrome ");
	  } else {
		  System.out.println("the String is not palindrome");
	  }
		  sc.close();
	  }
		}
	
