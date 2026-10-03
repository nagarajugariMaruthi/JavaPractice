package opps_Methods;

import java.util.Scanner;

public class Example_maximum {
	
	public int Exmaple_maximum(int a , int b) {
		
		
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static void main (String[] args) {
 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the First number: ");
	int num1  = sc.nextInt();
	
	System.out.println("Enter the Second number: ");
	int num2 = sc.nextInt();
	
	 Example_maximum obj =  new  Example_maximum();
	 
	 
	 int max = obj. Exmaple_maximum(num1, num2);
	 
	 System.out.println("Find the maximum number " + max);
	 
	 sc.close();
	}
}
	