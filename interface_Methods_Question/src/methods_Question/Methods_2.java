package methods_Question;

interface Calculator {
	static int add(int a , int b) {
		return a+b;
	}
}

@FunctionalInterface 
interface addition {
	int Calculate(int a, int b);
	
}

public class Methods_2 {

	public static void main(String[] args) {
		
		addition a = Calculator::add;
		System.out.println(a.Calculate(10, 44));
		
	}
	
}
