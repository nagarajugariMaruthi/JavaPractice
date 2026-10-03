package constructor_Practice;
import java.util.Scanner;
public class calculateInteres {

	double calculateInterest(double principal, double rate, double time) {
		
		double  Interest =(principal* rate* time) / 100;
		
		return  Interest;
	}
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Principal : ");
		double principal = sc.nextInt();
		
		System.out.println("Enter the rate : ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time : ");
		double time = sc.nextDouble();
		
		 calculateInteres obj = new  calculateInteres();
		 
		 double interest  = obj. calculateInterest(principal, rate, time);
		 
		 System.out.println("Simple Intrest : " + interest);
		 
		 sc.close();
		 
	}
}