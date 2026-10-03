package AssigmentOperators;

public class TerinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a = 10, b= 20;
   int max=(a > b)? a : b;
   int min=(a < b)? a : b;
   System.out.println("Maximum value: " + max);
   System.out.println("Minimum value: " + min);
}
}