package opps_Methods;

import java.util.Scanner;

public class SumofEvenNumbers {
	
	public int SumofEvenNumbers(int num) {
		
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			
			if( i % 2 == 0) {
				
				sum = sum +1 ;
			}
		}
		
		return sum;
	}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	
	 SumofEvenNumbers obj = new  SumofEvenNumbers();
	 
	 int result  = obj. SumofEvenNumbers(num);
	 
	 System.out.println("Sum of Even numbers " + result);
	 
	 sc.close();
}
}
	 
	 
