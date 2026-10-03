package java_imp_Question_practice25;
import java.util.Scanner;
public class find_Smallest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("first number : ");
   int a = sc.nextInt();
   
   System.out.println("second Number: ");
   int b = sc.nextInt();
   
   if(a < b) {
	   System.out.println("find the smallest Number: "+ a);
   } else  if(b < a) {
	   System.out.println("find the second smallest number: " + b);
   } else {
	   System.out.println("Both or equal");
   }
   sc.close();
	}
}
  