package constructor_Practice;
import java.util.Scanner;
public class SimpleInterest {

 void calculateInterest(double principal, double rate, double time) {
	 
	 double Interest = (principal * rate * time) / 100;
	 
	 System.out.println("Simpleintrest " + Interest);
 }
 
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("principal : ");
	 double principal = sc.nextDouble();
	 
	 System.out.println("rate");
	 double rate = sc.nextDouble();
	 
	 System.out.println("time");
	 double time = sc.nextDouble();
	 
	 SimpleInterest obj = new SimpleInterest();
	 
	 obj.calculateInterest(principal, rate, time);
	 
	 sc.close();
 }
}
	 