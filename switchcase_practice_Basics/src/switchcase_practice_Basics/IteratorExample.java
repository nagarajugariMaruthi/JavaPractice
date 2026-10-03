package switchcase_practice_Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> Lit  = new ArrayList<>();
		
		 Lit.add("Java");
		 Lit.add("SQL");
		 Lit.add("Python");
		 
		 Iterator<String> It =   Lit.iterator();
		 
		 System.out.println("Forward");
		 
		 while(It.hasNext()) {
			 System.out.println(It.hasNext());
		 }
		 
		 ListIterator<String> lit = Lit.listIterator();
		 
		 
		 System.out.println("BackWard");
	
		 
		 while(lit.hasNext()) {
			 System.out.println(lit.next());
		 }
		 
		 while(lit.hasPrevious()) {
			 System.out.println(lit.previous());
		 }
	}
}