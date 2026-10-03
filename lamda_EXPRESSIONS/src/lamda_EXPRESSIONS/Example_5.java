package lamda_EXPRESSIONS;

@FunctionalInterface 
interface square {
	int Square(int n);
	
}


public class Example_5 {
	
	// 5. Find square of a number.
	
	public static void main(String[] args) {
		
		square obj = n ->  n * n;
		
		int result = obj.Square(5);
		System.out.println("Findsquare = " + result);
	}

}
