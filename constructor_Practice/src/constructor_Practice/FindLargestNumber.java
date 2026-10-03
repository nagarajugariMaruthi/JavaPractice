package constructor_Practice;
import java.util.Scanner;
public class FindLargestNumber {

 static void findLargestNumber(int a , int b) {
	 
	 if(a > b) {
		 System.out.println("First LargestNumber : " + a);
	 } else {
		 System.out.println("Second LargestNumber : " + b);
		 
	 }
 }
	
	 public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in); 
		 
		 System.out.println("Enter the First Number: ");
		 int a = sc.nextInt();
		 
		 System.out.println("Second Largest Number : " );
		 int b = sc.nextInt();
		 
		 findLargestNumber(a,b);
		 
		 sc.close();
	 }
 }