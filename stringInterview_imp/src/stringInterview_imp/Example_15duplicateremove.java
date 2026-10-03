package stringInterview_imp;
import java.util.Scanner;

public class Example_15duplicateremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How to remove duplicate characters from a string?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine().toLowerCase();
		
		String result  = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(result.indexOf(ch) == -1) {
				result += ch;
				
			}
		}
		  
		System.out.println("String after Removening duplicate String: " + result);
		
		sc.close();
			}
}
		