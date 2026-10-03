package stringInterview_imp;

import java.util.Scanner;

public class Example_6StringContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  How to check if a string contains a substring? (contains())
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Main String: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the SubString" );
		String str2 = sc.nextLine();
		
		
		if(str1.contains(str2)) {
			System.out.println("SubString Found ");
			
		} else {
			System.out.println("SubString not Found ");
			
			sc.close();
		}
	}
}