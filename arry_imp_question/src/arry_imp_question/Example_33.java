package arry_imp_question;

public class Example_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 33. Check Whether an Array is Sorted.

    int[] arr = {10,20,30,40,50};
    
    
    boolean issorted = true;
    
    for (int i = 0; i < arr.length - 1; i++) {
	
    	if(arr[i] > arr [i + 1]) {
    		
    		issorted = false;
    		break;
    	}
    }
    	
    	if(issorted) {
    	
    		System.out.println("Array is sortted ");
    	} else {
    		System.out.println("Array is not sortted ");
    	}
    }
}
	