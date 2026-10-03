package advanced_level_program;

import java.util.Scanner;

public class Example_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  Write a program to reverse every word in a given sentence.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentance ");
		String sentance = sc.nextLine();
		
		String[] word = sentance.split("\\s+");
		
		System.out.println("Sentance after recevening each word ");
		
		for (String words : word)  {
			
			String reverse = "";
			
			for (int  i = words.length() -1; i >=0; i--) {
				
				reverse = reverse + words.charAt(i);
				
			}
			
			System.out.println(reverse +" ");
		}
	 sc.close();
	}
}