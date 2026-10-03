package java_imp_Question_practice25;
import java.util.Scanner;
public class YeaR_leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year");
		int year = sc.nextInt();
		
	if((year % 400 == 0) || year % 4 == 0 && year % 100 ==0) {
		System.out.println("year is leap year"+year);
	} else {
		System.out.println("year not leap year: " + year);
	}
	}
}