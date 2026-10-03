package constructor_Practice;
import java.util.Scanner;
public class Square_1 {

 public int findSquare(int num) {
	 
	 return  num * num;
 }
 
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
			 
		System.out.println("Enter the Number : " );
		int num = sc.nextInt();
		
		Square_1 obj = new Square_1();
		
		int findSquare = obj.findSquare(num);
		
		System.out.println("Square : " + findSquare);
		
		sc.close();
 }
}