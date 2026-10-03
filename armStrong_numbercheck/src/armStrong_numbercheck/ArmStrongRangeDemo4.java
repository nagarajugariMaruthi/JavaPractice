package armStrong_numbercheck;
import java.util.Scanner;
public class ArmStrongRangeDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		int starting = sc.nextInt();
		
		System.out.println("Enter the end the number: ");
		int end = sc.nextInt();
		
		System.out.println("ArmStrong number between " + starting +  "and" + end +"are");
		
		
	for(int number = starting; number <=end; number++) {
	
		int temp= number;
		int sum = 0;
		
		while(temp > 0) {
			int rem = temp % 10;
			sum = sum +(rem * rem* rem);
			temp = temp /10;
		}
		if(number == temp) {
			System.out.println(number);
		}
	}
	}
}