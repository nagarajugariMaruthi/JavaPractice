package collocation;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Names = new ArrayList<>();
		
		 Names.add("Ravi");
		 Names.add("Suresh");
		 Names.add("Kiran");
		 Names.add("Arun");
		 
		 ListIterator<String> itr = Names.listIterator();
		 
		 System.out.println("Forward");
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("\nBackword :");
	
		 while(itr.hasPrevious()) {
			 
			 System.out.println(itr.previous());
			 
}
		 }
		
	}

