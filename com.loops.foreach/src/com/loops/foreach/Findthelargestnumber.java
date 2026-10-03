package com.loops.foreach;

public class Findthelargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arry[] = {45, 65, 89, 77, 88 };
       int max = arry[0];
       
       for(int i = 0; i< arry.length; i++) {
    	   
    	   if(arry[i] > max) {
    		   max =arry[i];
    	   }
       }
       System.out.println("largest number :" + max);
    	   }
}


