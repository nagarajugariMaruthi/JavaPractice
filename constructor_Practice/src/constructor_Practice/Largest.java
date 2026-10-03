package constructor_Practice;
import java.util.Scanner;
public class Largest {

	void findLargest(int a, int b, int c) {
		
		if( a <= b && a >= c) {
			System.out.println("FirstLargest Number : " + a);
		
		} else if(b >= a && b >=c) {
			System.out.println("SecondLargest Number : " + b);
			
		} else {
			System.out.println("thirdLargest Number : " + c);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	 
		System.out.println("Enter First number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number :" );
		int b = sc.nextInt();
		
		System.out.println("Enter the third Number : " );
		int c = sc.nextInt();
		
		 Largest obj = new  Largest();
		 
		 obj.findLargest(a,b,c);
		 
		 sc.close();
	}
}
		 
		
		
