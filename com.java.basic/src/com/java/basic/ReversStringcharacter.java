package com.java.basic;

import java.util.Stack;

public class ReversStringcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Character>  stack = new Stack<>();
		
		String str = "JAVA";
		
		for (int i = 0; i < str.length(); i++) {
			
			stack.push(str.charAt(i));
		}
		
		String reversed = " ";
	
		
		while(!stack.empty()) {
			reversed = reversed +  stack.pop();
		}
		
		System.out.println("Original String : " + str);
		System.out.println("revers String : " + reversed);
	}
}
