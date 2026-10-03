package com.java.basic;

public class Example_4 {
	
	public static void main(String[] args) {
int[] arr = {20, 30, 50, 40, 10};

int firstsmallest = Integer.MAX_VALUE;
int secondsmallest = Integer.MAX_VALUE;
int thirdsmallest = Integer.MAX_VALUE;

	 for(int i = 0; i < arr.length; i++) {

    if (arr[i] < firstsmallest) {

        thirdsmallest = secondsmallest;
        secondsmallest = firstsmallest;
        firstsmallest = arr[i];

    } else if (arr[i] < secondsmallest && arr[i] != firstsmallest) {

        thirdsmallest = secondsmallest;
        secondsmallest = arr[i];

    } else if (arr[i] < thirdsmallest &&
               arr[i] != firstsmallest &&
               arr[i] != secondsmallest) {

        thirdsmallest = arr[i];
    }
}

 System.out.println("Third Smallest = " + thirdsmallest);
}
}