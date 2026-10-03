package come.Forloop.java;
import java.util.Scanner;
public class Demo5 {
public static void main(String[]args) {
	Scanner Sc = new Scanner(System.in);
	
	System.out.println("Enter number if terms: ");
	int n = Sc. nextInt();
	
	int a = 0,b = 1;
	System.out.printf("febanosicc series");
	
	for(int i = 1; i <=n; i++) {
		System.out.println(a+ " ");
		int next = a+b;  // core logic
		a = b;
		b = next;
	}
	Sc.close();
}
}