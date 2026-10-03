package arry_imp_question;

public class Example_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  int[] arr = {10,5,20,40,50};
  
  int smallest = arr[0];
  int largest  = arr[0];
  
  for (int i = 0; i < arr.length; i++) {
	
      if(arr[i] < smallest) {
    	  smallest = arr[i];
    	  
    	  if(arr[i] > largest) {
    		  largest = arr[i];
    	  }
    	  
    	 System.out.println("\n Print the Smallest Array  = " + smallest);
    	 System.out.println("\n Print the Largest Array  = " + largest);
      }
  }
	}
}