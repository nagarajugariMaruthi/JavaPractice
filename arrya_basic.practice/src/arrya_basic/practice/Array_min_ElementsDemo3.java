package arrya_basic.practice;

public class Array_min_ElementsDemo3 {
  
	public static void main(String[] args) {
		
		
		// first declaration 
		int[] arr = {20,30,5,40,80,90};
		
		// first Elements in mimum 
		int min = arr [0];
		
		// find the minumum Elements
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[0] < min) {
				min = arr[i];
				
				// print min Elements
				
  System.out.println("Enter the minmum Elements is: "+ min);
			}
		}
	}
}