package arrya_basic.practice;

public class Findsumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int[] number = {12,24,46,44,67,87,90};
		
		int sum = 0;
		 // count he sum of array elements 
		for (int i = 0; i < number.length; i++) {
			
			sum = sum + number[i];
		}
		
		// caluculate average  elements 
		
		double average = (double)  sum / number.length;
		
		System.out.println("Enter the sumof value = " + sum);
		System.out.println("Enter the sumof average value = " + average);
	}
}