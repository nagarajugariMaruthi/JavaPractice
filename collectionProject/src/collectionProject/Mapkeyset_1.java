package collectionProject;

import java.util.*;


public class Mapkeyset_1 {
	// 1. Convert Map keys into a List.
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(105, "maruthi");
		map.put(110, "dhanvitha");
		map.put(115, "sunil");
		map.put(120, "vamshi gowda");
		
		List<Integer> list = new ArrayList<>(map.keySet());
		
		System.out.println(list);
		
	}

}
