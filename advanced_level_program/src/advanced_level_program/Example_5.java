package advanced_level_program;

import java.util.Scanner;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to sort the characters of a string alphabetically.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character String: ");
		String str = sc.nextLine();
		
		// int temp =0;
		
		// Convert the tow String to caracters
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
		
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i] > ch[j]) {
					char  temp = ch[i];
					ch[i] =ch[j];
					ch[j] = temp;
				}
			}
			
			System.out.println("Sort String: ");
			
			for (int j = 0; j < ch.length; j++) {
				
				System.out.println(ch[i]);
			}
		sc.close();
		}
	}
}