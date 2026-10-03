package com.maruthi.project;
import java.util.Scanner;
public class Evenoraddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter arry size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter arry elements");
		
		for(int i = 0; i<n; i++) {
		}
			int evencount =0;
			int oddcount =0;
			
			for (int i = 0; i<n; i++) {
				
				if(arr[i] % 2 == 0) {
					evencount++;
				} else {
					oddcount++;
				}
				System.out.println("even="+evencount);
				System.out.println("Add="+oddcount);
			}
	}
}