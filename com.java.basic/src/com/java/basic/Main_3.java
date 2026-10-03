package com.java.basic;

import java.util.function.BiFunction;

public class Main_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> Product = 
				(a,b) -> a * b;
				
				 Integer result = Product.apply(10, 20);
				 
				 System.out.println("Product =  " + result);
		
	}

}
