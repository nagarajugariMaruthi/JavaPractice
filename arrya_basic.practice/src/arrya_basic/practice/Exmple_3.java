package arrya_basic.practice;

public class Exmple_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int[] array = {1,3,2,4,6,5,8,7,9};
		
		int temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("print the acending order ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}
	}
}