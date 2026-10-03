package arry_imp_question;

public class Example_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Count the Frequency of a Given Element.
    
		int[] arr = {10,10,20,10,30,40,50};
		
		int count = 0;
		int key =10;
		
		for (int i = 0; i < arr.length; i++) {
			
		  if(arr[i] == key) {
			  count++;
		  }
			  System.out.println("\nFrequency = " + count);
		  }
		}
	}
	
