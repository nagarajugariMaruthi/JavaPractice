package stringInterview_imp;

import java.util.Scanner;

public class Example_10Trimed_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How to trim spaces from a string? (trim())
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Original trim :'" + str + ",");
		System.out.println("Trimed String :'" +str.trim() + "'");
		
		sc.close();
	 
	}
}