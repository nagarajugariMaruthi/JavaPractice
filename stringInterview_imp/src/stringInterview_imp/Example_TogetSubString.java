package stringInterview_imp;

import java.util.Scanner;

public class Example_TogetSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //  How to get a substring? (substring(start, end))
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the Index: ");
		int start = sc.nextInt();
		
		
		String result = str.substring(start);
		
		System.out.println("SubString " + result);
		
		sc.close();
	}

}
