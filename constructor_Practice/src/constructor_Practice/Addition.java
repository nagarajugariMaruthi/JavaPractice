package constructor_Practice;
import java.util.Scanner;
public class Addition {

 void add(int a, int b) {
	 
	 int sum = a+b;
 
	 System.out.println("Addition : " + sum);
 }


public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
  
	System.out.println("Enter first the number : ");
	int a = sc.nextInt();
	
	System.out.println("Enter the Second number : " );
	int b = sc.nextInt();
	
	Addition obj = new Addition();
	
	obj.add(a, b);
	
	sc.close();
}
}
	
