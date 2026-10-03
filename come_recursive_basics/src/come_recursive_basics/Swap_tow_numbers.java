package come_recursive_basics;
public class Swap_tow_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}

