package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,10,30,40};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
	
	
		System.out.println("Frequency off array Elements ");
	
	
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		
		System.out.println(entry.getKey() + " = " + entry.getValue());
	}
	} 
