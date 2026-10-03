package core_Java_ImportentQuestion;

import java.util.Arrays;

public class FindSumEvenNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 15. Find the sum of even and odd numbers.
		
		int[] arr = { 10,15,20,25,30};
		
		int EvenSum = 0;
		int OddSum = 0;
		
		for(int num : arr) {
			
			if(num % 2 == 0) {
				
				EvenSum = EvenSum + num;
			
			} else {
				
				OddSum = OddSum + num;
			}
		}
		
		System.out.println("Sum of Even Number : " + EvenSum);
		System.out.println("Sum of odd Numbers  : " + OddSum);
			}
}