package arry_imp_question;

public class Example_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Check Whether Two Arrays are Equal.
		
		int[] arr1 = {10,20,40,50};
		int[] arr2 = {10,20,40,50};
		
		if(arr1.length != arr2.length) {
			System.out.println("Array are Not Equeal");
			return;
		}
			boolean isEqual = true;
			
		for (int i = 0; i < arr2.length; i++) {
			
			if(arr1[i] != arr2[i]) {
				isEqual = false;
				break;
			}
		}
		
		if(isEqual) {
			System.out.println("Array ia Equal ");
		} else {
			System.out.println("Array is not Equal");
		}
		}
	}
