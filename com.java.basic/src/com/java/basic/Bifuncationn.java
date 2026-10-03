package com.java.basic;

import java.util.function.BiFunction;

public class Bifuncationn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a+b;
		
		Integer Result = add.apply(100, 4000);
		
		System.out.println(Result);

	}

}
