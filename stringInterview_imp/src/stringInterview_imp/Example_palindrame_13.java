package stringInterview_imp;

import java.util.Scanner;

public class Example_palindrame_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine().toLowerCase();
		
		String reverse = "";
	
		for (int i = str.length() -1; i >= 0; i--) {
			
			reverse += str.charAt(i);
		}
			if(str.equals(reverse)) {
				System.out.println("It is palindrame : ");
			} else {
				System.out.println("It not palindrome : ");
			}
				sc.close();
				
			}
			}
