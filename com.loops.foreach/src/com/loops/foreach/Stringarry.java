package com.loops.foreach;

public class Stringarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String n = "1232";
       char d = '1';
       
       int max = Integer.MAX_VALUE;
       for(int i = 0; i < n.length(); i++) {
    	   if(n.charAt(i)==d) {
    	String temp = n.substring((int) 0.1)+n.substring(i+1);
    	 int val = Integer.parseInt(temp);
  if(val > max) {
	  max=val;
  }
    	   }
  }
       System.out.print("String value of " + max);
	}
}

