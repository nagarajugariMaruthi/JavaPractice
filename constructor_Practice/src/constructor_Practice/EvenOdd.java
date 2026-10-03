package constructor_Practice;
import java.util.Scanner;
public class EvenOdd {

 public  boolean isEven(int num) {
	 
	 if(num % 2 == 0) {
		 System.out.println(num + " isEven ");
	 } else {
		 System.out.println(num + " isodd ");
	 }
	 return false;
}
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the Number: ");
	 int num = sc.nextInt();
	 
	 EvenOdd obj = new EvenOdd();
	 
	  boolean result = obj.isEven(num);
	  
	  System.out.println("checkEvenOdd : " + result);
	  
	  sc.close();
}
}