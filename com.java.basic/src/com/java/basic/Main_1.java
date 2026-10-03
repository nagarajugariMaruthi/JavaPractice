package com.java.basic;

import java.util.function.BiFunction;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, String, String> FullName = 
				
				(firstName, LastName) -> firstName + "  " + LastName;
				
				String result = FullName.apply("NagarajuGari","MAruthi");
				
			System.out.println(result);

	}

}
