package string_intermidaite_question;

import java.util.Scanner;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     //	   Write a program to remove all white spaces from a string
		
		Scanner sc = new Scanner(System.in);

		System.out.println("remove the white spaces");
		String text =sc.nextLine();
		
		String Result = text.replaceAll("\\s+", "");
		
		System.out.println("Remove the replace order =" + Result);
		
		sc.close();
	}
}