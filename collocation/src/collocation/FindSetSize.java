package collocation;

import java.util.HashSet;
import java.util.Set;

public class FindSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> Numbers = new HashSet<>();
		
		Numbers.add(10);
		Numbers.add(20);
		Numbers.add(30);
		Numbers.add(20);
		Numbers.add(30);
		Numbers.add(10);
		Numbers.add(50);
		
		
		System.out.println("Set" + Numbers);
		
		System.out.println("find the number of unique elements  : " + Numbers.size());

	}

}
