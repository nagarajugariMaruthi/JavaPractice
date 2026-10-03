package advanced_level_program;
import java.util.Scanner;
public class Example_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to find and remove a specific character from a string.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Enter the character String");
		char ch = sc.nextLine().charAt(0);
		
		 
		String result ="";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) !=ch) {
				result = result + str.charAt(i);
				
			}
		}
		
		System.out.println("Originl String " +str);
		System.out.println("updates String " +result);
		
		sc.close();
	}
}
			