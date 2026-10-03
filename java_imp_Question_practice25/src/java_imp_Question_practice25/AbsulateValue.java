package java_imp_Question_practice25;
import java.util.Scanner;
public class AbsulateValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int Absvalue = Math.abs(num);
		
		System.out.println("Absulate value" + Absvalue);
	}
	}
