package string_intermidaite_question;
import java.util.Scanner;
public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  // . Write a program to count the number of vowels and consonants in a string.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String text = sc.nextLine().toLowerCase();
		
		int vowels = 0;
		int consonants = 0;
		
		for (int i = 0; i < text.length(); i++) {
			
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
				vowels++;
			
			}else {
		
		consonants++;
		}
	}
}
	System.out.println("Number of vowels " + vowels);
	System.out.println("number if consonants" + consonants);
	
    sc.close();
}
    }
 
    