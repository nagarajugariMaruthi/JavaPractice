package switchcase_practice_Basics;

import java.util.HashSet;
import java.util.HashMap;

public class HashSetHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> Set = new HashSet<>();
		
		Set.add(10);
		Set.add(20);
		Set.add(30);
		Set.add(10);
		
		System.out.println("HashSet " + Set);
		
		HashMap<Integer , String> Map = new HashMap<>();
		
		Map.put(1,"Java");
		Map.put(2, "Python");
		Map.put(3, "C++");
		
		System.out.println("HashMap : " + Map);
	}
}