package java_imp_Question_practice25;
import java.util.Scanner;
public class Find_greatest_Number {
	
	public static void main(String[] args) {
		
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the first number");
  int num1 = sc.nextInt();
  
  System.out.println("Enter the second number");
  int num2 = sc.nextInt();
  
  if(num1 > num2) {
	  System.out.println("is the greatest number");
  } else if (num2 > num1) {
	  System.out.println("is the second greatest number");
  } else {
	  System.out.println("Both or equals");
  } 
}
}