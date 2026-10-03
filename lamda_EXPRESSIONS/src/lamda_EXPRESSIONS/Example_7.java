package lamda_EXPRESSIONS;

@FunctionalInterface
  interface maximum {
	int Findmaximum(int a, int b);
}
 

public class Example_7 {
	
	// 7. Find maximum of two numbers.
	
	public static void main(String[] args) {
		
      maximum obj = (a,b) -> a > b ? a : b;
      
      int result = obj.Findmaximum(20, 50);
      
      System.out.println("Findmaximum = " + result);
	}
}