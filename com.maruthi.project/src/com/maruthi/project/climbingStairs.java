package com.maruthi.project;

	import java.util.Scanner;

	public class climbingStairs {
	    
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter number of stairs: ");
	        int n = sc.nextInt();
	        
	        // Base cases 
	        if(n == 1){
	            System.out.println("ways: 1");
	            return; 
	        }
	        
	        int first = 1;
	        int second = 2;
	        
	    // if n = 2
	    if(n == 2) {
	        System.out.println("ways: 2");
	        return;
	    }
	    
	    int ways = 0; 
	    
	    for(int i = 3; i <= n; i++) {
	        
	        ways = first + second;
	        
	        first = second;
	        second = ways;
	    }
	    
	    System.out.println("number of ways: "+ ways);
	    
	    sc.close();
	    }
	}

	    
