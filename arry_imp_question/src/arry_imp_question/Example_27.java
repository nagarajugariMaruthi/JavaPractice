package arry_imp_question;

public class Example_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/// Find the First Non-Repeating Element.
	
		int[] arr = {2,3,2,1,4,1,5,7,5};
		
		for (int i = 0; i < arr.length; i++) {
			
			
			boolean isRepeating  = false;
			
			// Comparive with all Elements
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(i != j && arr[i] == arr[j]) {
					isRepeating = true;
			         break;
				}
			}
				
				// Print the After the all Comparision 
				if(!isRepeating) {
					System.out.println("First  the non Repating Elements = " + arr[i]);
					return;
				}
			}
		
		
		System.out.println("Non repeating value ");
	}
}
