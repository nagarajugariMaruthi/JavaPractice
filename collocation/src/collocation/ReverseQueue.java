package collocation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<>();
		
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		System.out.println("Original Queue : " + queue);
		
		Stack<Integer> Stack = new Stack<>();
		
		while(!queue.isEmpty()) {
			Stack.push(queue.poll());
		}
		
		while(!Stack.isEmpty()) {
			
			queue.add(Stack.pop());
		}
		
		System.out.println("Reverse Queue  : " + queue);
	}
}
	