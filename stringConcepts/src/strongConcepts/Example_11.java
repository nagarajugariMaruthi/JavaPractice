package strongConcepts;
import java.util.Scanner;
public class Example_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // Write a program to check if a string contains a given substring. "hello".contains("o")
		// Main: hello
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the main String");
		String mainstr = sc.nextLine();
		
		System.out.println("Enter the SubString ");
		String sub = sc.nextLine();
		
		System.out.println("Contain SubString " + mainstr.contains(sub));
		
		sc.close();
	}
}
				