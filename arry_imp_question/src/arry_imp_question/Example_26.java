package arry_imp_question;

public class Example_26 {

	public static void main(String[] args) {            ///
		// TODO Auto-generated method stub
 
		// Find the First Repeating Element.
		
		int[] arr = {1,2,1,3,2,4,5,4};
		
		for (int i = 0; i < arr.length -1; i++) {
			
			
			for (int j = i + 1; j < arr.length -1;) {
				
				if(arr[i] == arr[j]) {
					
				}
				

				System.out.println("First Repeating Element.= "+arr[i]);
				return;
				}
		}
	
		
	 System.out.println("No Reapeting Array Elements ");
     }  
       }
