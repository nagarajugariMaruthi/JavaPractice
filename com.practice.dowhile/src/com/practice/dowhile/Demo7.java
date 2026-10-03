package com.practice.dowhile;
import java.util.Scanner;
public class Demo7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int choice;
      
      do {
    	  System.out.println("\n1.addition");
    	  System.out.println("2.substruction");
    	  System.out.println("3.multiplexion");
    	  System.out.println("4.division");
     
      choice = sc.nextInt();
      if(choice  >= 1  && choice >= 4) {
    	  System.out.println("Enter a number");
    	  int n = 10;
    	  int m = 20;
    	  int a = sc.nextInt();
    	  System.out.println("Enter secound number");
    	  int b = sc.nextInt();
    	  
    	  switch (choice) {
    	  case 1:
    		  System.out.println("Enter addition" +(a+b));
    		  break;
    	  case 2:
    		  System.out.println("substruction" +(a-b));
    		  break;
    	  case 3:
    		  System.out.println("multiplexion" +(a*b));
    		  break;
    	  case 4:
    		  System.out.println("divisition" +(a%b));
          case 5:
              if (b != 0)
                  System.out.println("Division = " + (a / b));
              else
                  System.out.println("Cannot divide by zero");
              break;
      }
  }

} while (choice != 5);

sc.close();
}
}
    		  
    	 
      
      