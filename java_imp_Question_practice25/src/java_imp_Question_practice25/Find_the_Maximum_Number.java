package java_imp_Question_practice25;
import java.util.Scanner;
public class Find_the_Maximum_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the first number:");
   int a = sc.nextInt();
   
   System.out.println("Enter the second  Number:");
   int b = sc.nextInt();
   
   System.out.println("Enter the thurd larges number: ");
   int c = sc.nextInt();
   
   System.out.println("Enter the fourth largest Number: ");
   int d = sc.nextInt();
   
	int max = a;
	
   if(b > max) {
	   max = b;
   } 
   if(c > max) {
	   max = c;
   } 
   if(d > max) {
		   max = d;
	   }
	   System.out.println("Maximum value: = " + max);
	   }
}  
	   
