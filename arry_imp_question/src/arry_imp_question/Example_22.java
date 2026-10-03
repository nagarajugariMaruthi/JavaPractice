package arry_imp_question;

public class Example_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Rotate an Array to the Right by One Position
		
		int[] arr = {10,20,30,40,50};
		
		// Stroe ELements 
		int temp = arr[arr.length - 1];
		
		//shift the left to right Elemental
		for (int i = arr.length -1; i < 0; i--) {
		
			arr[i] = arr[i];
		}
		
		arr[0] = temp;
	
	
  System.out.println("Array After Right Ratation: ");
  
  for(int i = 0; i < arr.length; i++) {
	  System.out.println(arr[i]+ "");
  }
  
}
}

  
  