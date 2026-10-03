package collocation;

import java.util.ArrayList;
import java.util.ListIterator;

public class WhileTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> Numbers = new ArrayList<>();
		
		Numbers.add(10);
		Numbers.add(20);
		Numbers.add(25);
		Numbers.add(30);
		Numbers.add(50);
		
		ListIterator<Integer> itr = Numbers.listIterator();
		
		while(itr.hasNext()) {
			
			int number = itr.next();
			
			if(number == 20) {
				itr.add(25);
			}
		}
		System.out.println(Numbers);
			}
		}
