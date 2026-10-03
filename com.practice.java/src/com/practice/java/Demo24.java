package com.practice.java;
import java.util.Scanner;
public class Demo24 {
	public static void main(String[]args) {
 // revere 
	
	int num = 180773, rev =0; 
	while(num != 0) {
		int digit = num % 10;
		 rev = rev * 10 + digit;
		num = num /10;
	}
	System.out.println(rev);
	}
}
