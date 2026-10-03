package stringInterview_imp;

import java.util.Scanner;

public class Example_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//  How to convert string to uppercase/? (toUpperCase(), toLowerCase(lowercase))
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		
		String uppercase = str.toLowerCase();
		
		System.out.println("Original String " + str);
		System.out.println("Uppercase String " + uppercase);
		
		sc.close();
	}
}
