package com.java.basic;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int[] arr = {10,20,10,30,20,40,30};
	 
	 for (int i = 0; i < arr.length; i++) {

		    boolean isduplicate = false;

		    for (int j = 0; j < i; j++) {

		        if (arr[i] == arr[j]) {
		            isduplicate = true;
		            break;
		        }
		    }

		    if (!isduplicate) {
		        System.out.print(arr[i] + " ");
		    }
		}
	}
}