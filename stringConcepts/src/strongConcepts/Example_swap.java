package strongConcepts;
import java.util.Scanner;
public class Example_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First string ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the Second String ");
		String s2 = sc.nextLine();
		
		
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		
		System.out.println("After Swapping ");
		System.out.println("Frist " + s1);
		System.out.println("Second " + s2);
		
		sc.close();
	}
}