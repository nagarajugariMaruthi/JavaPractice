package java_imp_Question_practice25;
import java.util.Scanner;
public class Check_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		System.out.println("Enter side 1: ");
		int a = Sc.nextInt();
		
		System.out.println("Enter side 2: ");
		int b = Sc.nextInt();
		
		System.out.println("Enter side 3: ");
		int c = Sc.nextInt();
		
		if ((a+b > c) && (b+a > c) && (c+b > a)) {
		      System.out.println("Valid triangile");
	     } else {
			System.out.println("not valid tringile");
		}
		Sc.close();
	}
}