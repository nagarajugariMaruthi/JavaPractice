package com.loops.foreach;

public class Palindram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "madam";
        String reverse = " ";
        
        for( int i = str.length() - 1; i >=0; i--) {
        	reverse = reverse + str.charAt(i);
        }
        	//check palindram 
        	if(str.equals(reverse)) {
        		System.out.println("palindram String");
        	} else {
        		System.out.println("not palindram String");
        	}
	}
}