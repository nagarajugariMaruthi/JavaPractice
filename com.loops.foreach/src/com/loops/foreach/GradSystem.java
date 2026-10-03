package com.loops.foreach;
import java.util.Scanner;

public class GradSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();
		
		if(marks >= 90) {
			System.out.println("grade A");
		} else if(marks >= 75) {
			System.out.println("grade B"); 
		} else if(marks >= 60) {
			System.out.println(" grade C");
		}  else {
			System.out.println("fail");
		}
		
	}
	}


