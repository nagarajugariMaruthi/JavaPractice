package arry_imp_question;

public class Example_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Remove Duplicate Elements from an Array.
		
		int[] arr = {10,20,10,30,10,20,40,50};
		
		
		for (int i = 0; i < arr.length; i++) {
			
		
			int j = 0;
			
			for ( j = 0; j < arr.length; j++) {
				
			
				if(arr[i] == arr[j]) {
					break;
				}
			}
				
					if(i == j) {
						
				System.out.println(arr[j]);
					}
		}
	}
}
		
