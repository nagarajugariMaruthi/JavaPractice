package java_imp_Question_practice25;
import java.util.Scanner;
public class CheckDigitORNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		if(ch >= '0' && ch <= '9') {
			System.out.println("is the Diget" + ch);
		}
		else {
			System.out.println("is the not Dige2t" + ch);
		}
		sc.close();
	}
}
