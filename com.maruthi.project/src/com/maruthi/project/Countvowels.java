package com.maruthi.project;
import java.util.Scanner;
public class Countvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter String: ");
    String str= sc.nextLine();
    
    int count = 0; 
    str = str.toLowerCase();
    
    for(int i = 0; i<str.length(); i++) {
    	char ch = str.charAt(i);
    	
    	if(ch == 'a' || ch =='i' || ch =='o' || ch == 'u' || ch == 'o') {
    		count++;
    	}
    }
    System.out.println("total vowels"+count);
     sc.close();
	}
}
    	