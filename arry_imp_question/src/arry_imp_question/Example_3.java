package arry_imp_question;

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Find the Second Largest Element in an Array.
		
		int[] arr = {10,20,30,40,60,70,50};
		
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > largest) {
				
				secondLargest = largest;
			 
			 largest = arr[i];
			}
		}
			 
		System.out.println("Enter the second largest Array = " + secondLargest);		
			}
			
		}