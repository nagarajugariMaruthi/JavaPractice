package core_Java_ImportentQuestion;

import java.util.Arrays;
import java.util.Iterator;

public class SoryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {50,20,30,40,10,30};
		
		for (int i = 0; i < arr.length-1 -i; i++) {
			
			for (int j = 0; j < arr.length-1 -i; j++) {
				
					  if (arr[j] > arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
							
			}
			
		}

      System.out.println("Sorted Array ");
      
      for (int num : arr) {
    	  System.out.println(num + " ");
      }
	}
}