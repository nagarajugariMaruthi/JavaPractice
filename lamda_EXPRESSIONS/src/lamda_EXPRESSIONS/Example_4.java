package lamda_EXPRESSIONS;

@FunctionalInterface

 interface Divid {
	int Divid(int a , int b);
}
 


public class Example_4 {
	
	// Divide two numbers using Lambda.
	
	public static void main(String[] args) {
		
		Divid obj = (a,b) -> a / b;
		
		int result = obj.Divid(10, 5);
		
		System.out.println("Devide = " + result);
	}


}
