 package com.loops.foreach;
	    import java.util.Scanner;
	    class demo1 {
	        // 1.palindrome number 
	 static void palindrome(int num) {
	     int original = num,reverse = 0;
	     
	     while(num > 0) {
	         int digit = num % 10;
	         reverse = reverse * 10 +digit;
	         num = num / 10;
	     }
	     
	     if(original == reverse)
	     System.out.println("palindrome");
	     else 
	     System.out.println("not palindrome");
	 }
	 
	 // 2. reverse string 
	 static void reversestring(String str) {
	     String reverse = "";
	     
	     for(int i = str.length() - 1; i>= 0; i--) {
	         reverse += str.charAt(i);
	     }
	     
	     System.out.println("reverse String: " + reverse);
	 }
	 
	 // 3. fibonacci series
	 static void fibonacci(int n) {
	     int a = 0, b = 1;
	     
	     System.out.print("fibonacci: ");
	     
	     for(int i = 0; i < n; i++) {
	         System.out.print(a+ " ");
	         
	         int c = a+b;
	         a = b;
	         b = c;
	     }
	     
	     System.out.println();
	 }
	 
	 //4. prime number
	 static void prime(int num) {
	     boolean isprime = true;
	     
	     for(int i = 2; i <= num / 2; i++) {
	         if(num % i == 0) {
	             isprime = false;
	             break;
	         }
	     }
	     
	     if(isprime)
	     System.out.println("prime");
	     else 
	     System.out.println("not prime");
	 }
	 
	 // 5. factorial 
	 
	 static void factorial(int num) {
	     int fact = 1;
	     
	     for(int i = 1; i <= num; i++) {
	         fact *= i; 
	     }
	     
	     System.out.println("factorial: " + fact);
	 }
	 
	 // 6. largest element
	 static void largestArray() {
	     int arr[] = {5, 2, 9,1,7};
	     
	     int max = arr[0];
	     
	     for(int i = 1; i < arr.length; i++) {
	         if(arr[i] > max)
	         max = arr[i];
	     }
	     
	     System.out.println("largest element: " +max);
	 }
	 
	 // 7. count vowels
	 static void countVowels(String str) {
	     int count  = 0; 
	     
	     for(int i = 0; i < str.length(); i++) {
	         
	         char ch = str.charAt(i);
	         
	     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	         count++;
	     }
	     }
	     System.out.println("vowels count: "+ count);
	 }
	 
	 // 8. swap numbers
	 static void swap() {
	     int a = 10, b = 20;
	     
	     int temp = a;
	     a = b;
	     b = temp;
	     
	     System.out.println("after swap a = " + a + " b= " +b);
	 }
	 
	 // 9.sum of array 
	 static void sumArray() {
	     int arr[] = {1, 2, 3, 4, 5};
	     
	     int sum = 0; 
	     
	     for(int i = 0; i < arr.length; i++) {
	         sum += arr[i];
	     }
	     
	     System.out.println("array sum: " + sum);
	 }
	 
	 // 10.Even odd
	 static void eveOdd(int num) {
	     
	     if(num % 2 == 0) 
	     System.out.println("Even");
	     else 
	     System.out.println("Odd");
	 }
	 
	 //  11.ArmStrong number
	 static void armstrong(int num) {
	     
	     int original = num;
	     int sum = 0;
	     
	     while(num > 0) {
	         
	         int digit = num % 10;
	         
	         sum += digit * digit * digit;
	         
	         num = num / 10;
	     }
	     
	     if(original == sum)
	     System.out.println("Armstrong");
	     else 
	     System.out.println("not armstrong");
	 }
	 
	 public static void main(String[] args) {
	     
	     palindrome(121);
	     
	     reversestring("maruthi");
	     
	     fibonacci(10);
	     
	     prime(13);
	     
	     factorial(5);
	     
	     largestArray();
	     
	     countVowels("education");
	     
	     swap();
	     
	     sumArray();
	     
	     eveOdd(11);
	     
	     armstrong(153);
	 }
	    }
	    
