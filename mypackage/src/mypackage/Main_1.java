package mypackage;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name : " );
		String Name =sc.nextLine();
		
		System.out.println("Enter the Age : ");
		int Age = sc.nextInt();
	
	
	System.out.println("Name : " + Name);
	System.out.println("Age  : " + Age);
	
	sc.close();
}
}