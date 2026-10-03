package constructor_Practice;
import java.util.Scanner;
public class Square {

 static void findSquare (int num) {
	 
	 int Square = num * num;
	 
	 System.out.printf("Square " + Square);
 }
	 
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number: ");
		 int num = sc.nextInt();
		 
		 findSquare(num);
		 
		 sc.close();
	 }
 }