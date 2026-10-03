package strongConcepts;
import java.util.Scanner;
public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First String ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the Second String ");
		String s2 = sc.nextLine();
		
		System.out.println("BOth are String Equals " +s1.equals(s2));
		
		sc.close();

	}

}
