package lamda_EXPRESSIONS;

@FunctionalInterface
  interface checkNumber {
	
	boolean check(int n);
}

public class Example_6 {
	
	// 6. Check even or odd.
	
	public static void main(String[] args) {
		
		checkNumber obj = n -> n % 2 == 0;
		
		boolean result = obj.check(10);
		System.out.println("checknumber = " + result);
	}
}
		