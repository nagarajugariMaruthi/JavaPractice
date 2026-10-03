package stringInterview_imp;
import java.util.Scanner;
public class Example_Compare_String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// 3. How to compare two strings? 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Second String: ");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("Both String or Equals ");
		} else {
			System.out.println("Both String or not Equals ");
			
			sc.close();
			
		}
	}
}