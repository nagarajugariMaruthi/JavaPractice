package lamda_EXPRESSIONS;

@FunctionalInterface
  interface addition {
	int add(int a , int b);
	
}
// 1. Add two numbers using Lambda.
public class Example_1 {
	public static void main(String[] args) {
		
		addition obj = (a,b) -> a+b;
		
		int result = obj.add(10, 88);
		
		System.out.println("Addition : " + result);
	}

}
