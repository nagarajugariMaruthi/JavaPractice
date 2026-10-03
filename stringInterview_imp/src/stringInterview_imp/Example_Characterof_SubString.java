package stringInterview_imp;

import java.util.Scanner;

public class Example_Characterof_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How to replace a character or substring in a string? (r

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Enter the character to Replace : ");
		char oldchar = sc.nextLine().charAt(0);
		
		System.out.println("Enter the new characyer String : ");
		char newchar = sc.nextLine().charAt(0);
		
		String result = str.replace(oldchar, newchar);
		
		System.out.println("Update String : " + result);
		
		sc.close();
	}
}
		
	