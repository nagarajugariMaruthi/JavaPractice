package stringInterview_imp;

import java.util.Scanner;

public class Example_8String_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// How to check if a string starts or ends with a certain sequence? (startsWith(), endsWith())
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter Prifix   String ");
		String prifix = sc.nextLine();
		
		if(str.startsWith(prifix)) {
		System.out.println("the String wiht \"" +prifix + "\".");
		} else {
			System.out.println("the String does start with frifix \"" + prifix + "\".");
			
			sc.close();
		}
		}
}