package arry_imp_question;

public class Example_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 // 20. Copy One Array into Another Array.
   
		int[] arr1 = {10,20,30,40,50,60};
		
		int[] arr2 = new int[arr1.length];
		
		// copy the Elements
		for (int i = 0; i < arr2.length; i++) {
		
			arr2[i] = arr1[i];
		}

		// coped Array
		System.out.println("Copied Arry ");
	  
		for (int i = 0; i < arr2.length; i++) {
			
			System.out.println(arr2[i] + "");
		}
	}
}