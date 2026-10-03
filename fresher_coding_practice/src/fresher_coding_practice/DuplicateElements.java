package fresher_coding_practice;

import java.util.Iterator;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// *Find duplicate elements in an array.**
		//   Example: `{10, 20, 10, 30, 20}` → `10, 20`
		
		int[] arr = {10,20,10,30,20};
		
		System.out.println("Duplicate Array Elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				
				if(arr[i] ==  arr[j]) {
					System.out.println(arr[j]);
					break;
					
				}
			}
			
		}


	}

}
