package com.loops.foreach;

public class PalindramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  String str = "maruthi";
	  String reverse = "";
	  
	  for(int i = str.length()-1; i<=0; i++) {
		  reverse = reverse +str.length();
		  
		  if(str.equals(reverse)) {
			  System.out.println("palindram");
		  } else {
			  System.out.println("not palindram");
		  }
	  }
	}
}

