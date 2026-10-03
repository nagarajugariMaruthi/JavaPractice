package opps_Methods;

public class Example_Factorial {

 public void Example_Factorial(int num) {
	 
	 int fact = 1;
	 
	 for (int i = 1; i <= num; i++) {
		
		 fact = fact * i;
	 
	 }
		 
		 System.out.println("factorial of " + num +  " = " + fact);
 }
		 
		 public static void main(String[] args) {
			 
			 
			 Example_Factorial obj = new Example_Factorial();
			 
			 obj.Example_Factorial(5);
			 obj.Example_Factorial(7);
			 obj.Example_Factorial(3);
		 }
}