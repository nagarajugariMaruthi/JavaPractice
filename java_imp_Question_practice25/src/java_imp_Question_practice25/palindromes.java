package java_imp_Question_practice25;
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the palindrome ");
	int num = sc.nextInt();
	
	int original = 0;
	int reverse = 0;
	
	while(num > 0) {
		int digit = num % 10;
		reverse = reverse *10+digit;
		num = num/10;
	}
	if(original == reverse) {
		System.out.println("palindrome");
	} else {
		System.out.println("not palindrome");
	}
	}
}