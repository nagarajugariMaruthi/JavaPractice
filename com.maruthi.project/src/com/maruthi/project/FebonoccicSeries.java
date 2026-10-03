package com.maruthi.project;
import java.util.Scanner;
public class FebonoccicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in); 
     
     System.out.println("Enter number");
     int n = sc.nextInt();
     
     int first = 0;
     int second = 1;
     
     System.out.println("febonoccicseries");
     
     for(int i=1; i<=n; i++) {
    	 System.out.println(first + " ");
    	 
    	 int next = first+second;
    	 first = second;
    	 second = next;
     }
     sc.close();
	}
}

