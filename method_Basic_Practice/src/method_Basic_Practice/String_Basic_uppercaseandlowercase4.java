package method_Basic_Practice;
import java.util.Scanner;
public class String_Basic_uppercaseandlowercase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Write a program to convert a string to uppercase and lowercase.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:  ");
		String text = sc.nextLine();
		
		System.out.printf("Uppercase\n : " + text.toUpperCase());
		System.out.printf("Lowercase\n : " + text.toLowerCase());
		
	sc.close();
	}
}