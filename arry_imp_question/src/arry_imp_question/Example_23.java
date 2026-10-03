package arry_imp_question;

public class Example_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Rotate an Array to the Left by K Positions.
		
		int[] arr = {10,20,30,40,50};
		
		int  k = 2;
		
		// Rotate K times 
		 for(int j = 0; j < k; j++) {
			 
			 // Store the first ELements 
		  int temp = arr[0];
		  
		 // shift the ELement to left 
		 for (int i = 0; i < arr.length -1; i++) {
		 
			 arr[i] = arr[i + 1];
		 }
		 
		 // place first Element At last 
		 
		 arr[arr.length-1] = temp;
		 }
		 
		//Print the Array 
	System.out.println("Array After Left Rotation ");

  for(int i = 0; i < arr.length; i++) {
	  
	  System.out.println(arr[i] + "");
  }
  }
	}

