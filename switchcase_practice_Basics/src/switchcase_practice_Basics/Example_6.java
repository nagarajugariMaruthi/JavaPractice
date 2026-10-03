package switchcase_practice_Basics;
 
import java.util.Scanner;

public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double balance = 50000;
		
		System.out.println("==========ATM MENU=========");
		System.out.println("1.check balance");
		System.out.println("2.Deposit money");
		System.out.println("3.withdra Money");
		System.out.println("4.Exit");
		
		System.out.println("Enter your chocie");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
		System.out.println("check Balance" + balance);
		break;
		
		case 2:
			System.out.println("Deposit the money");
			double deposit = sc.nextDouble();
			
			balance  = balance + deposit;
			System.out.println("Amount Deposit Sucussfully = ");
			System.out.println("Cureent balance" + balance);
			break;
			
		case 3:
			System.out.println("Withdra Amount ");
			double withdraw = sc.nextDouble();
			
		  if(withdraw <= balance) {
			  balance = balance + withdraw;
			  System.out.println("please Collect the casha");
			  System.out.println("current balance " +balance);
		  } else {
			  System.out.println("insuffient balance");
		  }
		  break;
		  
		case 4:
		System.out.println("Thank you for using ATM");
		break;
		
		default:
			System.out.println("invalid choice ");
		}
		sc.close();
	}
}
