package arry_imp_question;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		// Find the Largest Element in an Array.
		
		int[] arr = {10,20,40,50,70,80,60};
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length -1; i++) {
			
			 if(arr[i] > max);
			 
			 max = arr[i];
		}
	
	
	System.out.println("Enter the LargestElement = " + max);
}
}
	
