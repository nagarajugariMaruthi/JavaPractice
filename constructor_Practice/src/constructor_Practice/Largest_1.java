package constructor_Practice;
import java.util.Scanner;
public class Largest_1 {

	 int findLargest(int a, int b) {
		
		if( a > b) {
		
			return a;
			
		} else {
			 return b;
		}
	 }
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the First Number: ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the Second Number : " );
			int num2 = sc.nextInt();
			
			Largest_1 obj = new Largest_1();
			 
			   int largest = obj.findLargest(num1, num2);
			System.out.println("Largest Number : " + largest);
		
			sc.close();
		}
}