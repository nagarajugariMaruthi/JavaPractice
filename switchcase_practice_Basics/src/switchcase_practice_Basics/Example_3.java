package switchcase_practice_Basics;

import java.util.Scanner;
public class Example_3 {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number :");
		int a  = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		
		System.out.println("1\n.addtion ");
		System.out.println("2.subtraction ");
		System.out.println("3.multiplexen");
		System.out.println("4.Devision ");
		
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("addition = " +(a+b));
			break;
			
		case 2:
			System.out.println("subtruction = " +(a-b));
		  break;
		  
		case 3:
			System.out.println("multiplexion = " +(a*b));
			break;
			
		case 4:
			if (b != 0) 
				System.out.println("Devision = " + ((double) a / b));
				
				else 
					System.out.println("Devisible by zero is not allowed ");
					break;
			
					default:
			
						System.out.println("Invalid chocie");
				}
				sc.close();
			}
}

