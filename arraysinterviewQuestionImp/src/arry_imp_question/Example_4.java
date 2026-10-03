package arry_imp_question;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Find the Second Smallest Element in an Array.
		
		int[] arr = {10,20,30,40,50,60};
		
		int smallest = arr[0];
		
		int secondsmallest = Integer.MAX_VALUE;
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] < smallest) {
				
				int Secondsmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondsmallest && arr[i] != smallest) {
				
				 secondsmallest = arr[i];
			}
		}
		
		System.out.println("Enter the first smallest array  = " + smallest);
		System.out.println("Enter secondsmallest array = " + secondsmallest);
	}
}