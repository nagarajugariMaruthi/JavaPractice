package strongConcepts;
import java.util.Scanner;
public class Example_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		char[] arr = str.toCharArray();
		
		System.out.println("Array characaters ");
		
		for (char c : arr) {
			
			System.out.println(c + " ");
		}
		
		sc.close();
			
		}
	}

