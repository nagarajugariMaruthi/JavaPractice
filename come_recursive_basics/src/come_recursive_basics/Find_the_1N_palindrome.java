package come_recursive_basics;
import java.util.Scanner;
public class Find_the_1N_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		   for (int i = 1; i <= n; i++) {
			
			int number = i;
			int revers = 0;
			
		while(number>0) {
			int digit = number % 10;
			revers = revers *10 +  digit;
			number = number / 10;
		}
		if(i == revers) {
			System.out.println(i +"");
		}
	sc.close();
}
}
}