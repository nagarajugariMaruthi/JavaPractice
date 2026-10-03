package java_imp_Question_practice25;
import java.util.Scanner;
public class Find_thegreatest_offthreenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3 = sc.nextInt();
		
		if(num1 >= num2 && num1 >= num2) {
			System.out.println("is the greateste number: " + num1);
		} else if(num2 >= num1 && num2 >=num3) {
			System.out.println(" is the greateste number: " + num2);
		} else {
			System.out.println("is the greataste number: " + num3);
		}
		sc.close();
	}
}
	