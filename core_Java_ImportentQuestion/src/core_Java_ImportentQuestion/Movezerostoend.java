package core_Java_ImportentQuestion;

import java.util.Arrays;

public class Movezerostoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 12. Move all zeros to the end of an array.
		int[] arr = {0,1,0,3,12};
		
		int index = 0;
		
		for(int num : arr) {
			
			if(num !=0) {
				
				arr[index] = num;
				index++;
			}
		}
		
		while(index < arr.length) {
			arr[index] = 0;
			index++;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}