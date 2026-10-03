package arry_imp_question;

public class Example_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//Merge Two Arrays.
		
		int[] arr1 = {10,20,30};
		int[] arr2 = {40,50,60,};
		
		
		int[] merged = new int[arr1.length + arr2.length];
		
		int Index = 0;
		
		for (int i = 0; i < arr1.length; i++) {

             merged[Index] = arr1[i];
                
             Index++;
		}
	for (int i = 0; i < arr2.length; i++) {
			
		merged[Index] = arr2[i];
		
		Index++;
	}
	for (int i = 0; i < merged.length; i++) {
		System.out.println(merged[i] + "");
	}
	}
}