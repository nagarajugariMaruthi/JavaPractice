package strongConcepts;

import java.util.Scanner;

  public class Example_check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
	
		String rev = "";
		
		for (int i = str.length() -1; i >=0; i--) {
			
			 rev +=str.charAt(i);
		}
			 if(str.equalsIgnoreCase(rev)) {
				 
				 System.out.println("it is Palindrome");
			 } else {
			 
				 System.out.println("it is not palindrome");
				 
				 sc.close();
				 
			 }
		}
	}
  
