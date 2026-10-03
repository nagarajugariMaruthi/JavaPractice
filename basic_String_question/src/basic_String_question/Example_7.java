package basic_String_question;

import java.util.Scanner;

public class Example_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		
		String result = str.substring(2);
		
		System.out.println("Enter the SubString: " + result);
		
		sc.close();
	}

}
