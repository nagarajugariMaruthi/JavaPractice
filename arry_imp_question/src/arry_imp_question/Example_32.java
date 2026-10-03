package arry_imp_question;

public class Example_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Find the Kth Smallest Element in an Array.
		
		int[] arr = {10,20,5,30,50,60};
		
		int smallest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
		
			if(arr[i] < smallest) {
				
				smallest = arr[i];
			}
		}
		
		System.out.println("Smallest Array = " + smallest);
			}
}