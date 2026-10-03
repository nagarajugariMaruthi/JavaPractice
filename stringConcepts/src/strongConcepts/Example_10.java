package strongConcepts;
import java.util.Scanner;
public class Example_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		System.out.println("Enter the index ");
		int index = sc.nextInt();
		
		System.out.println("character index" +index+ ": " + str.charAt(index));
		
		sc.close();
	}

}
