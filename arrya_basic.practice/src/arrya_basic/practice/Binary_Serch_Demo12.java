package arrya_basic.practice;

public class Binary_Serch_Demo12 {
    
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50,60,70};
        
        int search = 50;
        
        int low = 0; 
        int high = arr.length -1;
        
        boolean found = false;
        
        while(low <= high) {
            
			int mid = (low + high) / 2;
            
            if(arr[mid] == search) {
                
                System.out.println("Elements found at index: " +mid);
                found = true;
                
                break;
                
            } else if (arr[mid] < search) {
                
                low = mid + 1; 
            } else {
                
                high = mid -1; 
            }
        }
        
        if(!found)
        System.out.println("Element not found");
    }
}
            