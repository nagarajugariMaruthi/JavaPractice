	package com.maruthi.project;

	public class Reversearray {
	    
	    public static void main(String[] args) {
	        
	        int arr[] = {10, 20, 30, 40, 50};
	        
	        System.out.println("original Array:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i] +"");
	        }
	        System.out.println();
	        
	        System.out.println("Reversed array:");
	        
	        for (int i = arr.length - 1; i >=0; i--) {
	            System.out.println(arr[i] + " ");
	        
	        }
	    }
	}
