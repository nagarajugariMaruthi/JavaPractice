package com.loops.foreach;
import java.util.Scanner;
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Uppercase → str.toUpperCase()
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string ");
		 
		String str = sc.nextLine();
		
		String result = str.toUpperCase();
		
		System.out.println("uppersecase" + result);
	}
}

