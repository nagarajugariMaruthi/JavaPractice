package com.java.basic;

import java.util.function.BiFunction;

public class Main {
	
	public static void main(String[]args) {
	
	BiFunction<Integer, Integer, Integer>  max = (a,b) -> a > b ? a : b;
	
	Integer Result = max.apply(10,40);
	
	System.out.println(Result);
	}
}
