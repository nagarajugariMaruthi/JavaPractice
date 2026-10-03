package com.maruthi.project;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    		
    System.out.println("Enter number");
    int num = sc.nextInt();
    
    boolean isprime = true;
     if(num > 0) {
    	 isprime = false;
     } else {
    	 for(int i = 2; i<=2; i++) {
    		 if(num % i == 0) {
    			 break;
    		 }
    	 }
     }
     if(isprime) {
    	 System.out.println("prime number");
     } else {
    	 System.out.println("not prime number");
      sc.close();
}
}
	
}