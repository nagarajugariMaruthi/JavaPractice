package come.Forloop.java;
import java.util.Scanner;
public class ForloopDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum of first N natural numbers → sum = n * (n + 1) / 2 forlopp using java
       Scanner Sc = new Scanner(System.in);

       System.out.println("Enter a number");
       int n = Sc.nextInt();
       
       int sum = 0;
       for(int i = 0; i<=n; i++) {
    	    sum = sum +i;
       }
       System.out.println("Sum of first " + n + " natural numbers is: " + sum);
       }
	}


