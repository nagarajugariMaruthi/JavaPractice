package com.practice.java;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //check if year is a leap year 
	 int year = 2026;
	  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		  System.out.println("leap year");
	  } else {
		  System.out.println("not a leap year");
	  }
	}
}
