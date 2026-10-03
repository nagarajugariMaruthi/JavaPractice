package java_imp_Question_practice25;
import java.util.Scanner;
public class Check_multipleof_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number");
  int num = sc.nextInt();
  
  if(num % 10 == 0) {
	  System.out.println("is multipule of 10 " + num);
  } else {
	  System.out.println("is not multipule of 10 " + num);
  }
	}
}