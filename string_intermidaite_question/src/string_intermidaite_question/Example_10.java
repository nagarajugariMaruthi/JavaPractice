package string_intermidaite_question;
import java.util.Scanner;
public class Example_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("the character is olde place ");
		char oldchar = sc.nextLine() .charAt(0);
		
		System.out.println("the character is new ");
		char newchar = sc.nextLine() .charAt(0);
		
		
		String result = str.replace(oldchar, newchar);
		
		System.out.println("updatted String " + result);
		
		sc.close();
	}
}
