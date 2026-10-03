package switchcase_practice_Basics;

import java.util.ArrayList;
import java.util.List;


public class ArrayListVsLinkedList {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ArrayList = new ArrayList<>();
		
		ArrayList.add(10);
		ArrayList.add(20);
		ArrayList.add(30);
		
		System.out.println("ArrayList : " + ArrayList);
		System.out.println("ArrayLinked List : " + ArrayList.get(1));
		
		List<Integer> LinkedList = new ArrayList<>();
		
		LinkedList.add(10);
		LinkedList.add(20);
		LinkedList.add(30);
		
		System.out.println("LinkedList : " + LinkedList);
		System.out.println("Linkedlist Elements  : " + LinkedList.get(1));
		
		ArrayList.add(1, 15);
		LinkedList.add(1, 15);
		
		System.out.println("After ArrayList Instration : " + ArrayList);
		System.out.println("Atter LinkedList instraction : " + LinkedList);
		
		ArrayList.remove(1);
		LinkedList.remove(1);
		
		System.out.println("After remove ArrayList : " + ArrayList);
		System.out.println("After remove LinkedList : " + LinkedList);
	}
}
		