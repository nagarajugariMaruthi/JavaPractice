package constructor_Practice;
import java.util.Scanner;
public class ReverseNumber {

	int reverseNumber(int num) {
		
		int reverse = 0;
		
		while(num != 0) {
			
			int digits = num % 10;
			reverse = reverse *10 + digits;
			num = num / 10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		ReverseNumber  obj = new ReverseNumber();
		
		int result = obj.reverseNumber(num);
		
		System.out.println("Reversed Number : " + result);
		
		sc.close();
	}
}
		