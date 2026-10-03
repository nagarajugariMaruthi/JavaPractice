package com.java.basic;

import java.util.function.BiFunction;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Double, Double, Double> bonus = 
				(Salary, Percentage) -> Salary * Percentage / 100;
				
				double result  = bonus.apply(50000.0, 10.00);
				
				System.out.println(result);

	}

}
