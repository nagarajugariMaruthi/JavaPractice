package switchcase_practice_Basics;

import java.util.Scanner;

public class Example_ResturantMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
			
	System.out.println("========== RESTURANT MENU ========");
	System.out.println("1.BIRYANI");
	System.out.println("2.EGG RICE");
	System.out.println("3.FRID RICE");
	System.out.println("4.THANDURI CHICKEN");
	System.out.println("5.MUTTON BIRYANI");
	
	System.out.println("Enter the choice");
	int choice = sc.nextInt();
	
	switch(choice) {
	
	case 1:
		System.out.println("ORDER BIRYANI");
		System.out.println("PRICE = 290");
		break;
		
	case 2:
		System.out.println("ORDER EGG RICE");
		System.out.println("PRICE = 100");
		break;
		
	case 3:
		System.out.println("ORDER FRID RICE");
		System.out.println("PRICE = 90");
		break;
		
	case 4:
		System.out.println("ORDER FRID RICE");
		System.out.println("PRICE = 120");
		break;
		
	case 5:
		System.out.println("ORDER THANDURI CHICKEN ");
		System.out.println("PRICE = 450");
		break;
		
	case 6:
		System.out.println("MUTTON BIRYANI");
		System.out.println("PRICE = 740");
		break;
		
		default:
			System.out.println("INVALID CURRY");
	}
	
	sc.close();
	}
}
