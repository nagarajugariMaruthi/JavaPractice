package collocation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;

public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  Str = "swiss";
		
		
		Queue<Character> queue = new LinkedList<>();
		
		HashMap<Character, Integer> Map = new HashMap<>();
		
		for(char ch : Str.toCharArray()) {
			
			Map.put(ch,Map.getOrDefault(ch, 0) + 1);
			queue.add(ch);
		}
		
		
		while(!queue.isEmpty()) {
			
			char ch = queue.poll();
			
			if(Map.get(ch) == 1) {
				System.out.println("First Non reapetive character :" + ch);
			}
		}
		

	}

}
