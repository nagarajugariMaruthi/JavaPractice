package armStrong_numbercheck;
import java.util.Scanner;
public class Findthe_first_Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter the first N value: ");
 int n = sc.nextInt();

 int count = 0;
 int number = 1;

 while (count < n) {

     int temp = number;
     int digits = 0;
     int sum = 0;

     // Count the number of digits
     while (temp > 0) {
         digits++;
         temp = temp / 10;
     }

     temp = number;

     // Calculate the sum of digits raised to the power of digits
     while (temp > 0) {
         int rem = temp % 10;
         sum = sum + (int) Math.pow(rem, digits);
         temp = temp / 10;
     }

     if (number == sum) {
         System.out.print(number + " ");
         count++;
     }

     number++;
 }

 sc.close();
}
}