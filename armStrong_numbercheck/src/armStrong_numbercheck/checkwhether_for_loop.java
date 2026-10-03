package armStrong_numbercheck;
import java.util.Scanner;
public class checkwhether_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		

		int sum = 0;
		
   for(int temp =number; temp>0; temp = temp /10) {
	   int rem = temp % 10;
	   sum = sum+(rem* rem* rem);
   }
	   if(number == sum) {
		   System.out.println(" is the armstrong number" + number);
	   }  else {
	  System.out.println("is the not armstrong number" + number);
	   }
	   sc.close();
   }
}