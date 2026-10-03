package com.practice.java;

public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

  num = Math.abs(num); // handle negative numbers

  if (num >= 0 && num <= 9) {
      System.out.println("Single-digit number");
  } else if (num >= 10 && num <= 99) {
      System.out.println("Double-digit number");
  } else {
      System.out.println("More than two digits");
  }

  sc.close();
}
}
