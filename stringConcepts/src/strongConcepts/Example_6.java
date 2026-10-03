package strongConcepts;
import java.util.Scanner;
public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Uppercase " +str.toUpperCase());
		System.out.println("Lowercase " +str.toLowerCase());
		
		sc.close();
	}
}