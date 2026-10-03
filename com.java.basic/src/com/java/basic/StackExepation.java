package com.java.basic;

import java.util.Stack;
import java.util.EmptyStackException;

public class StackExepation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// What happens when you call `pop()` on an empty Stack?**
		  // Explain `EmptyStackException` and how you can handle it.

		
		
		Stack<Integer> stack = new Stack<>();
		
		try {
			System.out.println(stack.pop());
			
		} catch (EmptyStackException e) {
			
			System.out.println("Stack is empty. Cannot perform pop operation ");
		}
	}
}
		