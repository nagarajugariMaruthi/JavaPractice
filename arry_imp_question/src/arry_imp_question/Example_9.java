package arry_imp_question;

public class Example_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Print Duplicate Elements in an Array.
		
		int[] arr = {12,13,12,14,15,14,20,12,20};
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					System.out.println(arr[i]);
				}
			}
		}
	}
}