package com.loops.foreach;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "maruthi";
      String reverse = " ";
      
      for(int i = str.length() -1; i <=0; i++) {
    	  reverse = reverse + str.charAt(i);
    	  
    	  String reversed;
		  System.out.println("reversed String" + reverse);
      }
      
	}

}
