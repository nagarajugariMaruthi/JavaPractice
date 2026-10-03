package come.Forloop.java;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the input value: ");
   int n = sc.nextInt(); 
  
   int sum = 0;
  
  for(int i = 0; i <= n; i++) {
	  sum = sum + i;
	  System.out.println("current sum value:" + sum);
  }
System.out.println("final sum value: = " + sum);

  sc.close();
}
}
