package arry_imp_question;

import java.util.Scanner;
public class Example_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Sc  = new Scanner(System.in);
	
	System.out.println("Enter the Febnoccic Number: ");
	
	int n = Sc.nextInt();
	
	int first = 0;
	int second = 1;
	
	for (int i = 1; i < n; i++) {
		
		System.out.println(first);
		
	int thurd = first+second;
	 first = second;
	 second = thurd;
	}
	}
}