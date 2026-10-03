package com.loops.foreach;
import java.util.Scanner;
public class checknumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number");
			int num = sc.nextInt();
			
			if(num % 3 == 0 && num % 5 ==0) {
				System.out.println("divisible by both 3 and 5"); 
			} else {
				System.out.println("not divisible by both 3 and 5");
			}
		}
	}
}