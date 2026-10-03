package armStrong_numbercheck;
import java.util.Scanner;
public class ArmStrongNumber_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int temp = number;
		int digit = 0;
		int  sum = 0;
		
		// caluculate the number of digit 
		while(temp > 0) {
			int rem = temp % 10;
			digit++;
			temp = temp / 10;
			
		temp = number;
		}
		// caluculate digits sum of power of digit  raised the digit 
		
		while(temp > 0) {
			int rem = temp % 10;
			sum = sum+(int) Math.pow(rem, digit);
			temp = temp /10;
		if(number == sum) {
			System.out.println("is the armstrong number" + number);
		} else {
			System.out.println("is the not amrstrong number" + number);
		}
		sc.close();
}
}
}