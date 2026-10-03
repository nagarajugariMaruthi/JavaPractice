package stringInterview_imp;

import java.util.Scanner;

public class Example_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // 11. How to reverse a string in Java?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String reverse = "";
		
		for (int i = str.length()  -1; i>=0; i--) {
			
			reverse = reverse + str.charAt(i);
		}
			System.out.println("Original String " + str);
			System.out.println("Reverse String " + reverse);
			
		
			sc.close();
		}
	}
