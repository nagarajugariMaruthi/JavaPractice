package com.java.basic;

public class Example_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int[] arr1 = {1,2,1,3,4,3,5,6,5};
		int[] arr2 = {1,2,3,4,5,6,7,8,9};

		int[] merged = new int[arr1.length + arr2.length];
		int k = 0;

		for (int i = 0; i < arr1.length; i++) {
		    merged[k++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
		    merged[k++] = arr2[i];
		}
		for (int i = 0; i < merged.length - 1; i++) {

		    for (int j = i + 1; j < merged.length; j++) {

		        if (merged[i] > merged[j]) {

		            int temp = merged[i];
		            merged[i] = merged[j];
		            merged[j] = temp;
		        }
		    }
		}
		for (int num : merged) {
		    System.out.print(num + " ");
		}
	}
}