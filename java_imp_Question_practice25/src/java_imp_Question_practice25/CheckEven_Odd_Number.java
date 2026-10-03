package java_imp_Question_practice25;
import java.util.Scanner;
public class CheckEven_Odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the number: ");
      int num = sc.nextInt();
      
      if(num % 2 == 0) {
    	  System.out.println("Even number: " + num);
      } else {
    	  System.out.println("Odd number: " + num);
      }
      sc.close();
	}
}
