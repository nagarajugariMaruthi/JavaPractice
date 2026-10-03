package arry_imp_question;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find the Sum of All Elements in an Array.
		
		int[] arr = {10,20,30,40,50,60,70,80,12};
		
		int sum = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
            sum = sum + arr[i];
		}
  System.out.println("Sum of the Array = " + sum);
	}
}