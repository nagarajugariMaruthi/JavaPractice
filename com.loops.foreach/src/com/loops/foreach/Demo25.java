package com.loops.foreach;
import java.util.Scanner;
public class Demo25 {
public static void main(String[]args) {
	
	// reverse number 
	int num = 60013, rev = 0;
	while(num != 10) {
		int digit = num % 10;
		rev = rev *+10 + digit;
		num = num  /10;
		System.out.println("rev");
		
	}
	
}
}
