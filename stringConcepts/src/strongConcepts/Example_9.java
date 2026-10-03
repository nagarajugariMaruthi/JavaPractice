package strongConcepts;
import java.util.Scanner;
public class Example_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the First String");
		int start = sc.nextInt();
		
		System.out.println("Enter the second  String");
		int end = sc.nextInt();
		
		
		System.out.println("SubString " + str.substring(start,end));
		
		sc.close();

	}

}
