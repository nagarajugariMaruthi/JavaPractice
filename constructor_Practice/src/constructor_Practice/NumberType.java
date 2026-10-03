package constructor_Practice;
import java.util.Scanner;
public class NumberType {

 static void checkNumber(int num) {
	 
	 if(num > 0) {
		 System.out.println(  num + " Num is positive");
		 
	 } else if (num < 0) {
		 System.out.println( num + " num is negitive");
		 
	 } else {
		 System.out.println( num + " num is zero");
		 
	 }
 }
 
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the First Number: ");
	 int num = sc.nextInt();
	
	 checkNumber(num);
	 checkNumber(num);
	 checkNumber(num);
	 
	 sc.close();
 }
}