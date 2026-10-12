package demoProject;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstnonrepeatedcharacterString {
	
	//3\. Find the first non-repeated character in a String.
    //Input: `"swiss"`

	public static void main(String[] args) {
		
		String str = "Swiss";
		
		  Map<Character, Integer> map = new LinkedHashMap<>();
		  
		    for(char ch : str.toCharArray()) {
		    	map.put(ch, map.getOrDefault(ch ,0) +1);
		    }
		    
		   for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			   if(entry.getValue() ==1 ) {
				   System.out.println("non repeative charactors : " + entry.getKey());
				   break;
			   }
		   }
	}
			   }
		 