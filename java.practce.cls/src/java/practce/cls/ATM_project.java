package java.practce.cls;
import java.util.Scanner;
public class ATM_project {

	public class ATMProject {
	    
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        double balance = 1000.0;
	        
	        while(true) {
	            
	            System.out.println("\n===== ATM MENU =====");
	            System.out.println("1.check Balance");
	            System.out.println("2.Deposit Money");
	            System.out.println("3.withdraw Money");
	            System.out.println("4.Exit");
	            System.out.println("Enter choice: ");
	            
	            int choice = sc.nextInt();
	    
	        switch(choice) {
	            
	            case 1:
	                System.out.println("Current Balance: ₹" +  balance);
	                break;
	                
	                case 2:
	                    System.out.println("Enter Deposit Amount: : ₹");
	                    double deposit = sc.nextDouble();
	                    
	                    balance += deposit;
	                    
	                    System.out.println("₹" + deposit + " Deposit successfully!");
	                    break;
	                    
	                    case 3:
	                        System.out.println("Enter withdrawal Amount: : ₹");
	                        double withraw = sc.nextDouble();
	                        
				double withdraw = 0;
				if(withdraw <= balance) {
	                            balance -= withdraw;
	                            System.out.println("Please collect your cash.");
	                        System.out.println("Remaining Balance: ₹" + balance);
	                    } else {
	                        System.out.println("Insufficient Balance!");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Thank You for Using ATM.");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid Choice!");
	            }
	        }
	    }
	}
}
	                       