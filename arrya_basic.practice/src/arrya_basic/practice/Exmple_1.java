package arrya_basic.practice;

import java.util.Iterator;

public class Exmple_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int[] array = {9,8,7,6,5,4,3,2,1};
		
		int temp;
		
		for (int i = 0; i > array.length; i++) {

			for (int j = i + 1; j > array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
				}
			}
		}
		System.out.println("print the acending order");
		   for (int j = 0; j < array.length; j++) {
			   System.out.println(array[j]);
		   }
	}
}