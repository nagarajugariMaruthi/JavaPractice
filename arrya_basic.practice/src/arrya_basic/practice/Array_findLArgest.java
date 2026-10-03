package arrya_basic.practice;

public class Array_findLArgest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int arr[] = {20,4,40,50,70};
     int largest = arr[0];
     
     for(int i = 1; i < arr.length; i++) {
    	   if(arr[i] > largest) {
    		   largest =  arr[i];
    	   }
     }
     
     System.out.println("Enter the largestnumber = " + largest);
	}
}

