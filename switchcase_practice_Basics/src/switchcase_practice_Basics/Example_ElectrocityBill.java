package switchcase_practice_Basics;

import java.util.Scanner; 

public class Example_ElectrocityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     //1. Domestic
	//	2. Commercial
	//	3. Industrial
	 Scanner sc = new Scanner(System.in);

	 System.out.println("=====Electricity bill pay ======");
	 System.out.println("1.Demestic Bill");
	 System.out.println("2.Commercial Bill");
	 System.out.println("3.Industrial Bill");
	 
	System.out.println("Enter choice Bill = ");
	int choice = sc.nextInt();
	
    switch(choice) {
    
    case 1:
    System.out.println("Demestice Bill");
    System.out.println("Demestice BIll = 9");
    break;
    
    case 2:
    	System.out.println("Commercial Bill");
    	System.out.println("Commercial bill = 10");
    	break;
    	
    case 3:
    	System.out.println("Industrial Bill");
    	System.out.println("Industril Bill = 8");
    	break;
    	
    	default:
    		System.out.println("invalid Bill");
    }
    sc.close();
	}   
}