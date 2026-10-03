package arry_imp_question;

public class Example_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  // Find the Kth Largest Element in an Array.
		
		int[] arr = {10,20,30,80,50,60};
		
		int largest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > largest) {
			 
			largest = arr[i];
			}
		}
	
	
	System.out.println("Largest Elements  = " + largest);
}
		}
	