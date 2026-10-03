package com.loops.foreach;

public class ReverserString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String  str = "maruthi";
        String reverse = " ";
        
        for (int i = str.length() - 1; i >=0; i--) {
        	reverse = reverse + str.charAt(i); 
        }
        System.out.println("original String = " + str);
        System.out.println("reversed String = "+ reverse);
        		
        	}
        	
        }


