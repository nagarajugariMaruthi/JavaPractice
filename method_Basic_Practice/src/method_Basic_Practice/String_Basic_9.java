package method_Basic_Practice;
import java.util.Scanner;
public class String_Basic_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Main String: ");
	    String text = sc.nextLine();
	 
	    System.out.println(" Enter the Sub String: ");
	    String sub = sc.nextLine();
	 
	 
	 if(text.contains(sub)) {
		 System.out.println("The String contain Sub String ");
	 } else {
		 System.out.println("the String contain does not String");
	 
		 sc.close();
	 }
	}
}