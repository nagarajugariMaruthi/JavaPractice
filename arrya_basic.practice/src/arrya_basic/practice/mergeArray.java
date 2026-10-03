package arrya_basic.practice;

public class mergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,6,7,8,9,};
		 
		int[] marged = new int[arr1.length + arr2.length];
		
		int index = 0;
	
		for (int i = 0; i < arr1.length; i++) {
			
			marged[index] = arr1[i];
			index++;
			
		}
		for (int i = 0; i < arr2.length; i++) {
			marged[index] = arr2[i];
			index++;
		}
		
		System.out.println("Marged Array");
	 for (int i : marged) {
		 System.out.println(i + "");
	 }
	}
}