 package com.practice.dowhile;
 import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
	
       System.out.println("Enter frist number ");
       int a = sc.nextInt();
       
       System.out.println("Enter secound number");
       int  b = sc.nextInt();
       
       System.out.println("chose the operation "); 
       System.out.println("1.add");  
       System.out.println("2.sub"); 
       System.out.println("3.multiplexen");
       System.out.println("4.divid");
       
       int choice = sc.nextInt();
       
       switch(choice) {
       case 1:
    	   System.out.println("addition = " + ( a+b)); 
    	   break;
       case 2:
    	   System.out.println("substruction=" + (a-b)); 
    	   break;
       case 3:
    	   System.out.println("Multiplication = " + (a * b)); 
    	   break;
       
       case 4:
    	   if(b != 0) 
    		  System.out.println("divesin =" +(a/b)); 
       else 
    	   System.out.println("cannot divide by the zero");
    	   break;
    	   
    	    default:  
    	    	System.out.println("invalid choice"); 
    	    	break;
       }
       sc.close();
	}
}
    	   
    	 
    	   
    	  