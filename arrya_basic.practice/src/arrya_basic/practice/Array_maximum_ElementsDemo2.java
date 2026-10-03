package arrya_basic.practice;

public class Array_maximum_ElementsDemo2 {
	    public static void main(String[] args) {
	        
	        // Array Declaration 
	        int[] arr = {10,25,66,99,100,45};
	        
	        // assum first element is maximum 
	        int max = arr[0];
	        
	        // find maximum element
	        for(int i = 1; i < arr.length; i++) {
	            
	            if(arr[i] < max) {
	                max = arr[i];
	            }
	        }
	        
	        //print maximum element
	        System.out.println("Maximum element is: " +max);
	            }
	        }
	    
