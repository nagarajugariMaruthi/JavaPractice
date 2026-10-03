package com.java.basic;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] arr = {2,1,3,5,4};
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
				for(int num : arr) {
					System.out.println(num + " ");
				}
				
			}
			
		}
	}

}
