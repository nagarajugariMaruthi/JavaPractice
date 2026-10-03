package com.java.basic;

import java.util.Stack;

public class StackMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// **What are the important methods of the `Stack` class?**
		 //  Explain `push()`, `pop()`, `peek()`, `search()`, and `empty()` with examples.


		

		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Stack : " + stack);
		
		System.out.println("pop : " + stack.pop());
		
		System.out.println("peek : " + stack.peek());
		
		
		System.out.println("seach : " + stack.search(10));
		
		System.out.println("seach : " + stack.empty());
	}
}
	