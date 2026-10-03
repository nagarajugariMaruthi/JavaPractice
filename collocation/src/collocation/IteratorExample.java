package collocation;

import java.util.Iterator;
import java.util.ArrayList;


public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Language = new ArrayList<>();
		
		Language.add("Java");
		Language.add("Python");
		Language.add("AQL");
		Language.add("c++");
		
		
		Iterator<String> itr = Language.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
