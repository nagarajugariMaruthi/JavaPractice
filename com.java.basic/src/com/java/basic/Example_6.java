package com.java.basic;

public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 3, 1, 4, 5, 6};

		for (int i = 0; i < arr.length; i++) {

		    int count = 0;

		    for (int j = 0; j < arr.length; j++) {

		        if (arr[i] == arr[j]) {
		            count++;
		        }
		    }

		    if (count == 1) {
		        System.out.print(arr[i] + " ");
		    }
		}
	}
}