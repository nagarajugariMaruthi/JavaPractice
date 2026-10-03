package strongConcepts;
import java.util.Scanner;
public class Example_Reverse_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Revers String = ");
		String str = sc.nextLine();
		
		String rev ="";
		
		for (int i =str.length() -1; i >=0; i--) {
		
			 rev += str.charAt(i);
			 
		}
			 System.out.println("Reversed = " + rev);
		
		sc.close();
	}
}
 