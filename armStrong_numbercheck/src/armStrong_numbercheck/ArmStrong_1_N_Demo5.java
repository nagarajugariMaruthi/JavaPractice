package armStrong_numbercheck;
import java.util.Scanner;
public class ArmStrong_1_N_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		
		 int count = 0;
		 
		 for(int number = 1; number <=N; number++) {
			 int temp = number;
			 int sum = 0;
			 
			 while(temp > 0) {
				 int rem = temp % 10;
				 sum = sum +(rem* rem* rem);
				 temp = temp / 10;
			 }
			 if(number == sum) {
				 count++;
				 System.out.println("Number of between 1 to n armStrong number" + N + "=" +count);
			 
			 sc.close();
			 }
		 }
	}
}