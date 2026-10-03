package java_imp_Question_practice25;
import java.util.Scanner;
public class Check_if_number_Equalornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("BOTh or Equal Number: ");
		} else {
			System.out.println("Boht or not Equal Number: ");
		}
	}
		}
		