package method_Basic_Practice;
import java.util.Scanner;
public class String_Basic_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   //  Write a program to compare two strings.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter the First String");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the second String");
		String str2 = sc.nextLine();
		
		 if (str1.equals(str2)) {
			  System.out.println("the Both are  Equal string");
		 } else {
			 System.out.println("the Both are String are not Equals");
		 }
	 sc.close();
	}
}
		