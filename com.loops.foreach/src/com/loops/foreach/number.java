package com.loops.foreach;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the frist number: ");
    int a = sc.nextInt(); 
    System.out.println("Enter the secound number: ");
    int b = sc.nextInt();
    
    if(a > b) {
    	System.out.println("frist number bigger : " +a);
    } else if (b > a) {
    	System.out.println("secound number bigger : " +b);
    } else {
    	System.out.println("boht number or equal ");
    }
    }
}