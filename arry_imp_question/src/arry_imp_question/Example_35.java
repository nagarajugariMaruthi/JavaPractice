package arry_imp_question;

public class Example_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    // Find the Intersection of Two Arrays.
		
		int[] arr1 = {10,20,30,40,50,60};
		int[] arr2 = {10,20,30,40,50,60,70};
		
		System.out.println("Intersection of Two Array = ");
	
		for (int i = 0; i < arr1.length; i++) {
		
			for (int j = 0; j < arr2.length; j++) {
				
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i] + " ");
					break;
					
				}
			}
		}
	}
}