package com.loops.foreach;
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Max element → max = Math.max(max, element)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int[] arry =new int[n];
		System.out.println("Enter elements");
		for(int i = 0; i < 1; i++) {
			arry [i] = sc.nextInt();
		}
		int max = arry[0];
		
		for(int i = 0; i < 2; i++) {
			Object math;
			 max = Math.max(max,arry[i]);
			 System.out.println("maximum elements" +max);
		}
	}
}