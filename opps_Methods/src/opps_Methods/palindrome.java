package opps_Methods;

import java.util.Scanner;

public class palindrome {
	
	public boolean ispalindrome(int num) {
		
	int orginal = num;
	int reverse = 0;
	
	while(num > 0) {
		
		int digit = num % 10;
		
		reverse = reverse * 10 + digit;
		
        num = num / 10;
	}
	
	return orginal == reverse;
	}
	 
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		palindrome obj = new palindrome();
		
		 boolean result  = obj.ispalindrome(num);
		 

	if(result) {
		System.out.println(num + " is palindrome");
	} else {
		System.out.println(num + " is not palindrome");
		
		sc.close();
	}
}
}
	