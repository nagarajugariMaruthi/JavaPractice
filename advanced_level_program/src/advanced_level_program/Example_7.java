package advanced_level_program;
import java.util.Scanner;
public class Example_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Write a program to find the longest substring without repeating characters.
   
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		String longest = "";
		
		for (int i = 0; i < str.length(); i++) {
			 
			String temp = "";
			
			for (int j = i; j < str.length(); j++) {
				
				char ch = str.charAt(j);
				
				if(temp.indexOf(ch) != -1) {
					break;
				}
				
				temp = temp +ch;
				
				if(temp.length() > longest.length()) {
					longest = temp;
				}
			}
		}
		System.out.println("length of String: " + longest);
		System.out.println("longest of String: " + longest.length());
}
}