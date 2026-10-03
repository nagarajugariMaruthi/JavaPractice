package collocation;

import java.util.ArrayList;
import java.util.Iterator;
public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> language = new ArrayList<>();
		
		
		language.add("java");
		language.add("Python");
		language.add("Sql");
		language.add("HtML");
		language.add("Spring");
		
		Iterator<String> iterator = language.iterator();
		
		while(iterator.hasNext()) {
			
			String langauge = iterator.next();
			if (langauge.equals("HtML")) {
	                iterator.remove();
			  }
		}
		
		for (String langauge  : language) {
			System.out.println(language);
		}
	}
		}
			
	