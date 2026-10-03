package arrya_basic.practice;

public class Reverse_ArrayDemo6 {
 
	public static void main(String[] args) {
		
		// Array Declaration 
		int[] arr = {10,20,30,40,50};
		
		System.out.println("original array");
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]+"");
		}
		System.out.println();
		
		// Reverse Array
		System.out.println("Reversed Array");

        for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]+"");
		}
	}
}