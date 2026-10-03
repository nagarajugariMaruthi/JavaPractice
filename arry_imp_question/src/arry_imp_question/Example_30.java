package arry_imp_question;

public class Example_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Sort an Array in Descending Order.
		
		int[] arr = {10,20,30,40,50,60};
		
		int temp = 0;
		
		for (int i = 0; i < arr.length -1; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
			if(arr[i] > arr[j]) {
				
				 temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
		
		System.out.println(" Decending Order = ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}