package constructor_Practice;
import java.util.Scanner;
public class Factorial {

 void finddFactorial(int num) {
	 
	 int Factorial = 1;
	 
	 for (int i = 1; i <= num;  i++) {
		 
		 Factorial = Factorial * i;
		 
	 }
	 
	 System.out.println("Factorial = " + Factorial);
 }
 
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the number: ");
	 int num = sc.nextInt();
	 
	 Factorial obj = new Factorial();
	 
	 obj.finddFactorial(num);
	 
	 sc.close();
 }
}