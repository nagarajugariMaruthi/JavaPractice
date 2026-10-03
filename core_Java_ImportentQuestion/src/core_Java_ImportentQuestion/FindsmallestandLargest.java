package core_Java_ImportentQuestion;

import java.util.Arrays;

public class FindsmallestandLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 9. Find the largest and smallest number in an array.
		
		int[] arr = {10, 20 , 30 , 50 , 90};
		
		int Smallest = Integer.MAX_VALUE;
		int Largest = Integer.MIN_VALUE;
		
		for(int num : arr) {
			
	  if(num > Largest) {
		  
		  Largest = num;
	  }
		  
		  if(num < Smallest) {
			  
			  Smallest = num;
		  }
		}
		  
		  System.out.println("Integer Langest Number : " + Largest);
		  System.out.println("Integer Smallest Number : " + Smallest);
	  }
		}
