package com.maruthi.project;
import java.util.Scanner;
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   
   System.out.println("Enter number");
   int num = sc.nextInt();
   
   int original = num;
   int sum = 0;
   
   while(num > 0) {
	   int digit = num % 10;
	   sum = sum + (digit * digit * digit);
		   num = num/10;
   }
   if(original == num) {
	   System.out.println("Armstrong number");
   } else {
	   System.out.println("not Armstrong number");
	   
	   sc.close();
   }
	}
}