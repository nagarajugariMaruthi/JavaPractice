package arrya_basic.practice;

public class Rotate_ArrayDemo11 {
	    
	    public static void main(String[] args) {
	        
	        int[] arr = {10,20,30,40,50};
	        
	        System.out.println("Original Array");
	        
	        for(int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i] + "");
	            
	            for(int i1 = 0; i1 < arr.length; i1++) {
	                System.out.println(arr[i1] + "");
	                }
	                
	                // Store last Elements
	                int last = arr[arr.length - 1];
	                
	                // shift last Elements to right
	                for(int i1 = arr.length -1; i1 > 0; i1--) {
	                    arr[i1] = arr[i1 -1];
	                }
	                
	                // place last elements at first position 
	                arr[0] = last;
	                
	                System.out.println("\nArray after Rotation: ");
	                
	                for(int i1 = 0; i1 < arr.length; i1++) {
	                    System.out.println(arr[i1] + " ");
	                }
	            }
	        }
}
