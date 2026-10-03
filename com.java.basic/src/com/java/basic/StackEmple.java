package com.java.basic;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackEmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> Stack = new ArrayDeque<>();
		
		Stack.push(10);
		Stack.push(30);
		Stack.push(50);
		
		
		System.out.println(Stack.pop());
		System.out.println(Stack.peek());
	}
}
