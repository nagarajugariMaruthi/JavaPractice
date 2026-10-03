package arrya_basic.practice;

public class Revemove_DuplicateArrayDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        int[] arr = {10,20,10,30,40,20,50};
		        
		    System.out.println("Array Elements after Removeing duplicates: ");
		    
		    for(int i = 0; i < arr.length; i++) {
		        
		        boolean isDuplicate = false;
		        
		        for(int j = 0; j < i; j++) {
		            
		            if(arr[i] == arr[j]) {
		                isDuplicate = true;
		                break;
		            }
		        }
		        if(!isDuplicate) {
		            System.out.println(arr[i]+ "");
		        }
		    }
	}
}