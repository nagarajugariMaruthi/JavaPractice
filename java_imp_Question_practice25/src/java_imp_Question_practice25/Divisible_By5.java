package java_imp_Question_practice25;
import java.util.Scanner;
public class Divisible_By5 {
 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	 int num = sc.nextInt();
	 
	 if(num % 5 == 0) {
		 System.out.println("is divisible:" + num);
	 }  else {
		 System.out.println("is not divisible: " + num);
	 }
	 sc.close();
}
}
