package collocation;

import java.util.ArrayList;
import java.util.Collection;

public class ClearCollocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> Numbers = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			
			Numbers.add(i);
			
		}
		
		System.out.println("Before clear : " + Numbers);
		
		Numbers.clear();
		
		System.out.println("After Clear : " + Numbers);
		
		System.out.println("Is Collocation Empty? : " + Numbers.isEmpty());
	}
}
