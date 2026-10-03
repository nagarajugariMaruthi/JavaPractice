package stringInterview_imp;

import java.util.Scanner;

public class Example_16ConvertStringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  How to convert a string to a char array? (toCharArray())


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]);
		}
			sc.close();
			
		}
		
	}


