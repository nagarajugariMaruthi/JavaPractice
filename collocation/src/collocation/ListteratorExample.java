package collocation;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Programming = new ArrayList<>();
		
		Programming.add("Java");
		Programming.add("Python");
		Programming.add("Java Script");
		Programming.add("sql");
		
		
		ListIterator<String> itr = Programming.listIterator();
		
		while(itr.hasNext()) {
			
			String Programmr = itr.next();
			
			if(Programmr.equals("C++")) {
				itr.set("Java Script");
			}
			
			System.out.println(Programmr);
		}
	}
			}
	