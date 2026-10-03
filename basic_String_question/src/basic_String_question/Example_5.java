package basic_String_question;

import java.util.Scanner;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String " );
		String str = sc.nextLine();
		
		if(str.isEmpty()) {
			System.out.println("the String isEmpty");
		} else {
			System.out.println("the String is not Empty");
			
		}
			sc.close();
		}
	}

