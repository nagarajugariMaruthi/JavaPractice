package basic_String_question;

import java.util.Scanner;

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		
		
		if(str1.equals(str2)) {
			System.out.println("Both String are equals");
		}
		else {
			System.out.println("Both String are not equals");
		
			
			sc.close();
		}
	}
}