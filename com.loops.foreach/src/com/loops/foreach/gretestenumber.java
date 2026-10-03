package com.loops.foreach;
import java.util.Scanner;
public class gretestenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a >= b && a >=c) {
			System.out.println("greteste number is: "+a);
		} else if(b >=a && b >=c) {
			System.out.println("gresteste number is: "+b);
		} else {
			System.out.println("grested number is: " +c);
		}
	}
}