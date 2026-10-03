package collocation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class FindDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Sentance = "Java is a easyy and Power Langauge ";
		
		String[] words = Sentance.split(" ");
		
		HashMap<String, Integer> Map = new  HashMap<>();
		
		for(String words1 : words) {
			
			if(Map.containsKey(words1)) {
				
				Map.put(words1, Map.get(words1) +1);
				
			} else {
				
				Map.put(words1,1);
				
			}
		}
		
		System.out.println("word frequency : " + Map);
		
		System.out.println("Duplicate words : " );
		
		
		for(Entry<String, Integer> entry : Map.entrySet()) {
			
			if(entry.getValue() >1) {
				
				System.out.println(entry.getKey());
			}
		}
	}
}
		