package opps_Methods;

import java.util.Scanner;

public class Calculate {
	
	public int power(int base, int exponet) {
		
		int result = 1;
		
		for (int i = 1; i <= exponet; i++) {
			  result = result* base;
			  
		}
			return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base: ");
		int base = sc.nextInt();
 
		System.out.println("Enter the exponet: ");
		int exponet = sc.nextInt();
		
	Calculate obj = new Calculate();
	
	int answer = obj.power(base,exponet);
	
	System.out.println(base + " rasid to the power " +exponet + " is " + answer);
	
	sc.close();
	}
}
		