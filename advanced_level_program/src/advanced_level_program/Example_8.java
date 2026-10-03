package advanced_level_program;
import java.util.Scanner;
public class Example_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to count alphabets, digits, and special characters in a string.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		int alphabets = 0;
		int digits = 0;
		int characters = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
		
			if(Character.isLetter(ch)) {
				alphabets++;
			} 
			else if(Character.isDigit(ch)) {
				digits++;
			}
			else if(!Character.isWhitespace(ch)) {
			   characters++;
			}
		}
		
		System.out.println("Number of alphabets:=  " + alphabets);
		System.out.println("Number of digits: = " + digits);
		System.out.println("Number of characters: =" + characters);
		
		sc.close();
	}
}