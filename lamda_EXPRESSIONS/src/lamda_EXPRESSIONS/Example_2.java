package lamda_EXPRESSIONS;
@FunctionalInterface
  interface Substract {
   int Subtract(int a, int b);
}

public class Example_2 {
	
	// 2. Subtract two numbers using Lambda.
	
	public static void main(String[] args) {
		
		Substract obj =(a,b) -> (a-b);
		
	 int result = obj.Subtract(10, 9);
	 
	 System.out.println("Subract  = " + result);
	}

}
