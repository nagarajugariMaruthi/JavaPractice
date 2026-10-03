package advanced_level_program;
import java.util.Scanner;
public class Example_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Write a program to print all permutations of a string using recursion.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		System.out.println("Perumtation are: ");
		perumation(str, "");
		
		sc.close();
	}
	
	public static void perumation(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			
			perumation(remaining, ans + ch);
		}
	}
}
	