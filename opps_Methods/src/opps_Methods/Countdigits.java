package opps_Methods;

import java.util.Scanner;

public class Countdigits {
	
	public int Countdigits(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		int count = 0;
		num = Math.abs(num);
		
		while(num > 0) {
			
			count++;
			num = num / 10;
			
		}
	
		return count++;
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
        Countdigits abc = new Countdigits();
    

        int result = abc.Countdigits(num);
	     
	     System.out.println("Number of digits " + result);
	     
	     sc.close();
	}
}