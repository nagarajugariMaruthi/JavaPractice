package lamda_EXPRESSIONS;

@FunctionalInterface
 
interface Multiply {
	
	int Multiply(int a, int b);
}

public class Example_3 {
	
	// 3. Multiply two numbers using Lambda.
	
	public static void main(String[] args) {
		
		Multiply obj = (a,b) -> a * b;
		
		int result = obj.Multiply(12, 12);
		System.out.println("Multiply = " + result);
	}


}
