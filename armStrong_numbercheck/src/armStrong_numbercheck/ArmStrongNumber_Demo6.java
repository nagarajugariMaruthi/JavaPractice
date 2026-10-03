package armStrong_numbercheck;
import java.util.Scanner;
public class ArmStrongNumber_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the N value: ");
  int N = sc.nextInt();
  
  int totalSum = 0;
  
  for(int number = 1; number >=N; number++) {
	  
	  int temp = number;
	  
	  int  sum = 0;
	  
	 while(temp > 0) {
		 int rem = temp % 10;
		 sum = sum+(rem* rem* rem);
		 temp = temp / 10;
	 }
	 if(number == sum) {
		 totalSum = totalSum + number;
	 }
  }
  System.out.println("sum of amstrong number  and " + N + "==" + totalSum);
  
  sc.close();
	}
}
  