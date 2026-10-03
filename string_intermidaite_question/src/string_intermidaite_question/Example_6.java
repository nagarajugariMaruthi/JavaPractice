package string_intermidaite_question;
import java.util.Scanner;
public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//  Write a program to remove duplicate characters from a string
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the String: ");
		String str = sc.nextLine();
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (result.indexOf(String.valueOf(ch)) == -1) {
				result.append(ch);
			}
		}
			
		System.out.println("Remove the String duplicate value : " + result);
		
		sc.close();
	}
}