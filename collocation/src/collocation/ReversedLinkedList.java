package collocation;

import java.util.LinkedList;

public class ReversedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> Numbers  = new LinkedList<>();
		
		Numbers.add(10);
		Numbers.add(20);
		Numbers.add(30);
		Numbers.add(40);
		Numbers.add(50);
		Numbers.add(60);
		Numbers.add(70);
		Numbers.add(80);
		
		System.out.println("Originale Numbers : " + Numbers);
		
		LinkedList<Integer> Reversed = new LinkedList<>();
		
		for (Integer Number : Numbers) {
			Reversed.addFirst(Number);
		}
		
		System.out.println("Reverse Numbers " + Reversed);
		}

}
