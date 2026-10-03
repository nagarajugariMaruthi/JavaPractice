package advanced_level_program;
import java.util.Scanner;
public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// 27. Write a program to check if two strings are rotations of each other.
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the First String: ");
		 String str1 = sc.nextLine();
		 
		 System.out.println("Enter the Second String: ");
		 String str2 = sc.nextLine();
		 
		 // check length
		 if(str1.length() != str2.length()) {
	 
	 System.out.println("the String are not Rotinal String: ");
	 sc.close();
	 return;
		 }
		 
		 boolean found = false;
		 String temp = str1;
		 
		 for (int i = 0; i < str1.length(); i++) {
			 
			 // rotate left by one characater 
			 temp = temp.substring(1)+temp.charAt(0);
			 
			 if(temp.equals(str2)) {
				 
				 found = true;
				 break;
			 }
		 }
		 
		 if (found) {
			    System.out.println("The strings are rotations of each other.");
			} else {
			    System.out.println("The strings are not rotations of each other.");
			}

			sc.close();
	}
}