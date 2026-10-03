package java_imp_Question_practice25;
import java.util.Scanner;
public class Tow_Digit_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num >=10 && num <=99) {
			System.out.println("is the tow digit Number" + num);
		} else {
			System.out.println("is not tow digit number" + num);
		}
		sc.close();
		}
	}