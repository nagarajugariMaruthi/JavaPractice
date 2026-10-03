package come.Forloop.java;
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multiplication table → result = num * i (i = 1 to 10)
	Scanner Sc = new Scanner(System.in); 
	
	System.out.println("Enter number for multiplication table: ");
	       int n = Sc.nextInt();
	       System.out.println("Multiplication Table for " + n + ":");
	       for (int i = 1; i <= 10; i++) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	        }
	    }
	}