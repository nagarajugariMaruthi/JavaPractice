package com.maruthi.project;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("first String");
  String str1 = sc.nextLine();
  
  System.out.println("Enter second String");
   String str2 = sc.nextLine();
   
   str1 = str1.toLowerCase();
   str2 = str2.toLowerCase();
   
   char arr1[] = str1.toCharArray();
   char arr2[] = str2.toCharArray();
   
   Arrays.sort(arr1);
   Arrays.sort(arr2);
   
   if(Arrays.equals(arr1,arr2)) {
	   System.out.println("anagram");
   } else {
	   System.out.println("not anagram");
   sc.close();
   }
	}
}