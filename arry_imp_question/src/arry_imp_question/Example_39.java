package arry_imp_question;

public class Example_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 39. Find the Majority Element in an Array.

		int[] arr = {2,2,1,2,3,2,2};
		
		int n = arr.length;
		boolean found = false;
		
		for (int i = 0; i < arr.length; i++) {
			
		 int count = 0;
			

     for (int j = 0; j < arr.length; j++) {
	 
    	 if(arr[i] == arr[j]) {
        count++;
     }
		}
		if(count > n / 2) {
			System.out.println("Majarity of Elements : " + arr[i]);
			found = true;
			break;
		}
	}
	
	if(!found) {
		System.out.println("Majarity of Elements ");
	}
	}
}