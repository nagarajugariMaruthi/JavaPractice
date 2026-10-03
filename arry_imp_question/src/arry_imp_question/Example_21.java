package arry_imp_question;

public class Example_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Rotate an Array to the Left by One Position.
		
		int[] arr = {10,20,30,40,50};
		
		// store the Elements 
		int temp = arr[0];
		
		// shift the Element to Left 
		for (int i = 0; i < arr.length -1; i++) {

				arr[i] = arr[i + 1];
			}
	
			arr[arr.length - 1] = temp;
		
			
		System.out.println("Arry Left Roation");
	  
		// print the rotatte array 
		for (int i = 0; i < arr.length; i++) {
		
			System.out.println(arr[i] + " ");
		}
	}
		}