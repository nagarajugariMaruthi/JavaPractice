package stringInterview_imp;

import java.util.Scanner;

public class Example_String_Length2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		  // 2. How to find the length of a string?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		 System.out.println("Length of String: " +str.length());
		 
		 sc.close();
	}

}
