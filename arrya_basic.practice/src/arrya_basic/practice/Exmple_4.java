package arrya_basic.practice;

public class Exmple_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		int[] array = {10,20,30,40,50,60,70,90};
		
		int temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				
				if(array[i] < array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(" print the Decending order ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}
	}
}
	