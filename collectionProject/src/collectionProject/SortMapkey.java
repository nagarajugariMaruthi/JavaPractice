package collectionProject;

import java.util.*;

public class SortMapkey {
	// 4. Sort a Map by keys in ascending order.
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(102,  "maaruhti");
		map.put(101,  "dhanvitha");
		map.put(105,  "nagaraju");
		map.put(110,  "sony");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(entry ->
        System.out.println(entry.getKey() + " : " + entry.getValue()));
}
}