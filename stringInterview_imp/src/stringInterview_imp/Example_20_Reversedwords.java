package stringInterview_imp;

import java.util.Scanner;

public class Example_20_Reversedwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentance ");
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		
		System.out.println("Reversed String ");
		
		for (int i = words.length -1;  i >= 0; i--) {
			
			System.out.println(words[i] + " ");
		}
			
			sc.close();
		}
	}
			
		
		