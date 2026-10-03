package arry_imp_question;

public class Example_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sort an Array in Ascending Order
		
		int[] arr = {10,30,40,20,50};
		
		int temp = 0;
		
		for (int i = 0; i  < arr.length-1; i++) {
	
			
			for (int j = i + 1; j < arr.length; j++) {
				
				
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Acending Order =");
	
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			}
}