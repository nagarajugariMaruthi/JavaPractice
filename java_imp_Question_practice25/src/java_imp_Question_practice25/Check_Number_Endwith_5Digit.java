package java_imp_Question_practice25;
import java.util.Scanner;
public class Check_Number_Endwith_5Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(Math.abs(num)  % 10 == 5) {
			System.out.println("the number End with digit 5.");
		} else {
			System.out.println("the number does not  end with digit 5. ");
		}
	}
}
