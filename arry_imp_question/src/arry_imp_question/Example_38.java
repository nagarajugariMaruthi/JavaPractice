package arry_imp_question;

public class Example_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find the Leaders in an Array.
		
		int[] arr = {16,17,5,2,6,3};
		
		System.out.println("Leaders In Array ");
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean isleader = true;
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
				
					isleader = false;
					break;
				}
			}
				if(isleader) {
					System.out.println(arr[i] +" ");
				}
			}
		}
	}
