package core_Java_ImportentQuestion;

import java.util.Arrays;

public class FindLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 8. Find the second-largest number in an array.
		
		int[] arr = {10, 20, 40 , 30 , 80, 90,};
		
		int Largest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MAX_VALUE;
		
		for(int num : arr) {
			
			if(num > Largest) {
				
				SecondLargest = Largest;
				Largest = num;
			 
			} else if(num > SecondLargest && num !=Largest) {
				
				SecondLargest = num;
			}
		}
			
			System.out.println("First LargestNumber : " + Largest);
			System.out.println("Second LargestNumbers : " + SecondLargest);
				
			}
		}

	
