package advanced_level_program;

import java.util.Scanner;
public class Example_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Write a program to check whether a string is a pangram
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Sentance: ");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		
		boolean[] latters = new boolean[26];
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				
				latters[ch - 'a'] = true;
			}
		}
		
		boolean ispangram = true;
		
		for (int i = 0; i < 26; i++) {
			if(!latters[i]) {
				
				ispangram = false;
				break;
			}
				if(!ispangram) {
					System.out.println("the give String is a pangram ");
				} else {
					System.out.println("the given String is not pangram ");
				
				
				sc.close();
			}
		}
		}
	}
	