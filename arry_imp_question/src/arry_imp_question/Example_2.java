package arry_imp_question;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find the Smallest Element in an Array.
	
		int[] arr = {10,5,15,20,25,30};
		
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Enter smallest Elements = " + min);
			}
}
