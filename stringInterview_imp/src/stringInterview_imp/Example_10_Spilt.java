package stringInterview_imp;

import java.util.Scanner;

public class Example_10_Spilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Sentance ");
	String str = sc.nextLine();
	
	String[] words = str.split(" ");
	
	System.out.println("Words in the Sentance ");
	
	for (String word : words) {
		
		System.out.println(word);
		
		sc.close();
	}
	}
}
