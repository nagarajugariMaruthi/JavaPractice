package constructor_Practice;
import java.util.Scanner;
public class NumberCheck {

 void checkEvenOdd(int num) {
	 
	 if(num % 2 == 0) {
   System.out.println(num + "isEven");
	 } else {
		 System.out.println(num +" is odd");
	 }
 }
	 
	 public static void main(String[] args) {
		 
	 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Ente the Number : ");
		 int num = sc.nextInt();
		 
		 NumberCheck n1 = new  NumberCheck();
		 
		 n1.checkEvenOdd(num);
		 n1.checkEvenOdd(num);
	 }
	 }
		 
	 