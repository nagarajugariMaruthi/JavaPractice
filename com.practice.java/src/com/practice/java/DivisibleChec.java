package com.practice.java;

import java.util.Scanner;

public class DivisibleChec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter number");
        int num = sc.nextInt();
        if(num % 2 == 0 && num % 3 ==0) {
	System.out.println("number is divisible both 2 and 3");
        } else {
        	System.out.println("number is not divisible both 2 and 3");
        }
        sc.close();
	}
        }


