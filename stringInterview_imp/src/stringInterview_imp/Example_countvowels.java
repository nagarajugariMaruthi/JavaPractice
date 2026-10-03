package stringInterview_imp;

import java.util.Scanner;

public class Example_countvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12. How to count vowels/consonants in a string?

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		String str = sc.nextLine().toLowerCase();
		
		int vowels = 0;
		int consonantes = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
	    char ch = str.charAt(i);
	    
	    if(ch >= 'a' && ch <= 'z') {
	    	
	    	if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u') {
	    		
	    		vowels++;
	    		
	    	} else {
	    		consonantes++;
	    		
	    	}
	    }
		}
		
		System.out.println("Vowels count: " + vowels);
		System.out.println("Consonantes : " + consonantes);
		
		sc.close();
	}
}
	    