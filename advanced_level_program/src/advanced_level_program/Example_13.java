package advanced_level_program;
import java.util.Scanner;

public class Example_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Write a program to find the longest palindromic substring.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentance ");
		String str = sc.nextLine();
		
		String longest ="";
		
		for (int i = 0; i < str.length(); i++) {
			
			// odd length palindrame
			
			String odd = expand(str,i,i);
			
			if(odd.length() > longest.length()) {
				longest = odd;
			}
			
			// Even length 
			
			String even = expand(str,i,i+1);
			
			if(even.length() > longest.length()) {
				longest = even;
			}
		}
				
				System.out.println("longest palindrom substring " +longest);
			
				sc.close();
			}
		
			
			public static String expand(String str, int left, int right) {
				
				while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
				    left--;
				    right++;
				}
		  return str.substring(left+1, right);
			}
		}