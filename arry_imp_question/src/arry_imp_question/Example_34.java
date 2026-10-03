package arry_imp_question;

public class Example_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   // Find the Union of Two Arrays
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {10,20,30,40,50,60,70};
		
		// check Elements off arry 
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] +"");
		}
			// check Elements second array
			for (int j = 0; j < arr2.length; j++) {
				 
				boolean found = false;
			
				for (int i = 0; i < arr1.length; i++) {
					
				   if(arr1[i] == arr2[j]) {
					   
					   found = true;
					   break;
				   }
				}
				   // print only if ELements is not Array 
				   
				   if(!found) {
					   System.out.println(arr2[j] + "");
					   
				   }
				}
			}
	}
