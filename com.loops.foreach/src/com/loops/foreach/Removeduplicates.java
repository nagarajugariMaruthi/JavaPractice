package com.loops.foreach;

import java.util.LinkedHashMap;
import java.util.Map;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 1, 5};
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int num : arr) {
			
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		System.out.println("After Removening Duplicate");

		for (int num : map.keySet()) {
		 System.out.print(num + " "); 
		}
	}
}