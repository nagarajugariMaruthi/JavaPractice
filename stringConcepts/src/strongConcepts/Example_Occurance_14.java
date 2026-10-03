package strongConcepts;

import java.util.Scanner;

public class Example_Occurance_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Characater String ");
		char oldchar = sc.next().charAt(0);
		
		System.out.println("Characater of old String ");
		char newchar = sc.next().charAt(0);
		
		String  result = str.replace(oldchar,newchar);
		
		System.out.println("After the Replacement characater: " + result);
	
		sc.close();
	}
}
