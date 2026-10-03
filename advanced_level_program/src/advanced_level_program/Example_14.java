package advanced_level_program;
import java.util.Scanner;
public class Example_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  Write a program to compress a string using run-length encoding.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String = ");
		String str = sc.nextLine();
		
		String  compressed ="";
		
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			
		if(i<str.length() -1 && str.charAt(i) == str.charAt(i+1)) {
			count++;

		} else {
			compressed = compressed + str.charAt(i) + count;
		 count++;
		}
	}
	
	System.out.println("Compressed String" + compressed); 
	
	sc.close();
}
}