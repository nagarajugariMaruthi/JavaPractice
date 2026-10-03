package arry_imp_question;

public class Example_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  //Find Common Elements Between Two Arrays.
		
		int[] arr1 = {10,20,10,30,10,40,50,};
		int[] arr2 = {20,10,50,60,70,80,90};
		
		System.out.println("Print the comman Elements ");
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
			
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i] + "");
			}
			
		}
}
	}
}