package java_imp_Question_practice25;
import java.util.Scanner;

public class Check_Divisible_2by7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
	System.out.println("Enter the number" );
	 int num = sc.nextInt();
	 if (num % 3 == 0 && num % 7 == 0) {
		 System.out.println( "Divisible by both 3 and 7" + num);
	 } else {
		 System.out.println("Not divisible by both 3 and 7" + num);
	 }
	 sc.close();
	}
}
