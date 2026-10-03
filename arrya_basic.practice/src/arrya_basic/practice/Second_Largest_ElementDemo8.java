package arrya_basic.practice;

public class Second_Largest_ElementDemo8 {

	private static final String FirstLargest = "";
	private static int firstLagest;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // Array Declaration 
		int[] arr = {10,20,45,67,89,64};
		
		int firstLargest = arr[0];
		int secondLargest = arr[0];
		
		// find Largest Elements
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > firstLargest) {
			 firstLagest = arr[i];
			}
		}
		// find the second Laregest Elements
			for(int i = 0; i < arr.length;  i++) {
		      if(arr[i] > secondLargest && arr[i] != firstLargest) {
		    	   secondLargest = arr[i];
		      }
			}
			System.out.println("first Largest Elements:" + FirstLargest);
			System.out.println(" second Largest Elements: " + secondLargest);
	}
}
		    	 