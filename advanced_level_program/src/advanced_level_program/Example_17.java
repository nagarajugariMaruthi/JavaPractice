package advanced_level_program;
import java.util.Scanner;
public class Example_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find the character with maximum frequency.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine().toLowerCase();
		
		int[] frequency = new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			frequency[str.charAt(i)]++;
			
		}
     int max = 0;
		char maxchar = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (frequency[ch] > max && ch != ' ') {
				max = frequency[ch];
				maxchar = ch;
				
			}
		}
		System.out.println("Character with maximum frequency " + maxchar);
		System.out.println("frequency " + max);
		
		sc.close();
	}
}
