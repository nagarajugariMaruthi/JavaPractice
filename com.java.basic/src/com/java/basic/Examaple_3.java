package com.java.basic;

import java.util.Iterator;

public class Examaple_3 {

	public static <secondlargest> void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr = {10,20,30,40,50,60,};
     
   int firstlargest = arr[0];
   int secondlargest = arr[0];
   
   for (int i = 1; i < arr.length; i++) {
	
	   if(arr[i] > firstlargest) {
		   
		   secondlargest = firstlargest;
		   firstlargest = arr[i];
	   
	   } else if(arr[i] > secondlargest && arr[i] != firstlargest) {
		   
		   secondlargest = arr[i];
	   }
   }
	System.out.println("secondlargest = " + secondlargest); 
	}
}
