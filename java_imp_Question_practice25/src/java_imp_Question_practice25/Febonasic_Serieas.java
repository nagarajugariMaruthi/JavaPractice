package java_imp_Question_practice25;
import java.util.Scanner;
public class Febonasic_Serieas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the terma numner ");
		int n = sc.nextInt();
		
		int a = 0, b = 1;
		
		System.out.println("Enter the febonasic serias ");
		
		for(int i = 1; i <=n; i++) {
			System.out.println(a + " ");
			
			int c = a+b;
			 a = b;
			 b = c;
		}
	}
}