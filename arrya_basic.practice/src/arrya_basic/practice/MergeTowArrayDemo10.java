package arrya_basic.practice;

public class MergeTowArrayDemo10 {
	    
	    public static void main(String[] args) {
	        
	        int[] arr1 = {10,20,30};
	        int[] arr2 = {40,50,60};
	        
	        // create new array with combined size
	 int[] mergearray;
	 int[] arr = mergearray = new int[arr1.length + arr2.length];
	 
	 // copay first Array Elements
		int[] mergeArray = new int[arr1.length + arr2.length];

	// copy first array Elements
	for(int i = 0; i < arr1.length; i++) {
	    mergeArray[i] = arr1[i];
	}

	// copy second array Elements
	for(int i = 0; i < arr2.length; i++) {
	    mergeArray[arr1.length +1] = arr2[i];
	}

	// print merged array
	System.out.println("Merge Array ELements:");

	for(int i = 0; i < mergeArray.length; i++) {
	    System.out.println(mergeArray[i] + "");
	}
	    }
}