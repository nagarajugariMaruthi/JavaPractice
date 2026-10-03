package com.maruthi.project;

	import java.util.Scanner;

	public class studentproject {
	    
	    // function to print fibonacci series
	    
	    public static void  fibonacci(int n) {
	        
	        int a = 0, b = 1; 
	        
	        System.out.println("fibonacci series: ");
	        
	        for(int i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            
	            int c = a+b;
	            a = b;
	            b = c;
	        }
	        
	        System.out.println();
	    }
	    
	    // function to find maximum marks
	    public static int maximum(int arr[]) {
	        
	        int max = arr[0];
	        
	        for(int i = 1; i < arr.length; i++) {
	            
	            if(arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        
	        return max;
	    }
	    
	    // function to find minimum marks
	    public static int minimum(int arr[] ) {
	        
	        int min = arr[0];
	        
	        for(int i = 1; i < arr.length; i++) {
	            
	            if(arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        
	        return min;
	    }
	    
	    // function to calulate average
	    public static double average(int arr[]) {
	        
	        int sum = 0;
	        for(int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return (double) sum / arr.length;
	    }
	    
	    /// function reverse String
	    public static String reverse(String str) {
	        
	        String rev = "";
	        
	        for(int i = str.length() -1; i >=0; i--) {
	            rev += str.charAt(i);
	        }
	        
	        return rev;
	    }
	    
	    // main method
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        // Student nam
	        System.out.println("Enter student name: ");
	        String name = sc.nextLine();
	        
	        // Array size
	        System.out.println("Enter number of subject: ");
	        int n = sc.nextInt();
	        
	        int marks[] = new int[n];
	        
	        // input marks
	        System.out.println("Enter subject marks: ");
	        
	        for(int i = 0; i <= n; i++) {
	            marks[i] = sc.nextInt();
	        }
	        
	        // display the marks 
	        System.out.println("\nStudent name: " + name);
	        
	        System.out.print("marks: ");
	        
	        for(int i = 0; i < n; i++) {
	            System.out.println(marks[i] + " ");
	            }
	            //maximum 
	        System.out.println("maximum marks: " + maximum(marks));
	        
	        // minimum 
	        System.out.println("minimum marks: " + minimum(marks));
	        
	        // Average
	        System.out.println("Average marks: " + average(marks));
	        
	        // Average name
	        System.out.println("Reverse name: " + reverse(name));
	        
	        // fibonacci
	        fibonacci(10);
	        
	        // result
	        boolean pass = true;
	        
	        for(int i = 0; i < n; i++) {
	            
	            if(marks[i] < 35) {
	                pass = false;
	                break;
	            }
	        }
	        
	        if(pass) {
	            System.out.println("Result: PASS");
	        } else {
	            System.out.println("Result: FAIL");
	        }
	        sc.close();
	    }
	}
