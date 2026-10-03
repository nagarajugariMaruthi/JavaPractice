package collocation;

import java.util.HashSet;
import java.util.Set;

public class FindComanElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> Set1 = new HashSet<>();
		
		Set1.add(10);
		Set1.add(20);
		Set1.add(30);
		Set1.add(40);
		Set1.add(50);
		
		Set<Integer> Set2 = new HashSet<>();
		
		Set2.add(30);
		Set2.add(40);
		Set2.add(50);
		Set2.add(60);
		Set2.add(70);
		
		System.out.println("Set1 : " + Set1);
		System.out.println("Set2 : " + Set2);
		
		Set1.retainAll(Set2);
		
		System.out.println("Coman Elements : " + Set2);
	}
}
		