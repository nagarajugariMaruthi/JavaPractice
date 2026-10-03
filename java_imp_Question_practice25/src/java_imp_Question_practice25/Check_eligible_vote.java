package java_imp_Question_practice25;
import java.util.Scanner;
public class Check_eligible_vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("He is Eligible vote");
		} else {
			System.out.println("He not not Eligible vote");
		}
	}
}
