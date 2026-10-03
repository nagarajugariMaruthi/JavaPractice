package stringInterview_imp;

import java.util.Scanner;

public class Example_intigerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 18. How to convert a string to integer / integer to string? (Integer.parseInt(), String.valueOf())

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		String str = sc.nextLine();
		
		
		int number = Integer.parseInt(str);
		
		System.out.println("Integer value : " +number);
		System.out.println("adding ten integer value : " +(number + 10));
		
	
		sc.close();
	}
}
