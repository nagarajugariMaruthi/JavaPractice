package com.loops.foreach;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a*5 >= 0) {
			System.out.println("a * 5 = " +(a*b));
		} else if (b*50 >= 0) {
			System.out.println("b * 50 =" +(a*b));
		} else {
			System.out.println("A+b"+(a+b));
			
		}
	}
}