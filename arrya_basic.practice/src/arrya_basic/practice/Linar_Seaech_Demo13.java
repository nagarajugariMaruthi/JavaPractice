package arrya_basic.practice;

public class Linar_Seaech_Demo13 {
	    public static void main(String[] args) {
	        
	        int[] arr = {10,25,45,60,75,90};
	        
	        int search = 60;
	        
	        boolean found = false;
	        
	        for(int i =0; i < arr.length; i++) {
	            
	            if(arr[i] == search) {
	                System.out.println("Element found at index: " +i);
	                
	                found = true;
	                
	                break;
	            }
	        }
	    
	    if(!found) {
	        System.out.println("Element not found");
	    }
	    }
	    
}
