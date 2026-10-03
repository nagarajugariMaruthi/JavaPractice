package com.loops.foreach;
import java.util.Scanner;
public class Divisblecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0  && num % 5 == 0) {
			System.out.println("divisible 3 by 5 "); 
			} else {
				System.out.println("not divisible by both");
				
			}
			
		}

	}
