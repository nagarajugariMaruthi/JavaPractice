package arry_imp_question;

public class Example_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  Find the Missing Number in an Array.
		  
		int[] arr = {1,2,4,5};
		
		int n = arr.length + 1;
		
   // ExpectedSum
    int expectedSum = n * (n + 1) / 2;
    
    // AcualSum
    int actualSum = 0;
    
		for (int i = 0; i < arr.length; i++) {
		   actualSum +=arr[i];
		
		}
	      int missingnumber = expectedSum - actualSum;
		
		System.out.println("missing number = " + missingnumber);
	}
}
