package collocation;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> Numbers = new ArrayList<>();
		
		Numbers.add(10);
		Numbers.add(20);
		Numbers.add(30);
		Numbers.add(40);
		Numbers.add(50);
		
		Iterator<Integer> itr = Numbers.iterator();
		
		while(itr.hasNext()) {
			int number = itr.next();
			
			if(number == 30) {
				itr.remove();
			}
		}
		
		System.out.println(Numbers);
			}
		}
		
	