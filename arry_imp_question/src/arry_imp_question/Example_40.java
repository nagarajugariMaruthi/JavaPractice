package arry_imp_question;

public class Example_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    // 40. Find the Maximum Sum Subarray (Kadane's Algorithm).
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int currentsum = 0;
		int maxsum = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
		 currentsum = currentsum +arr[i];
		   if(currentsum > maxsum) {
			   maxsum = currentsum;
		   }
	
		if(currentsum < 0) {
			currentsum = 0;
		}
	}

	System.out.println("Maximum sum = " + maxsum);
		}
}

