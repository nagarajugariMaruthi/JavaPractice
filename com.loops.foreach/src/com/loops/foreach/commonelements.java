package com.loops.foreach;

import java.util.HashMap;
import java.util.Map;

public class commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,4,5,6,7};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr1) {
			
			map.put(num, map.getOrDefault(num, 0) + 1); {
			}
			
			for(int num1 : arr2) {
				
				if(map.containsKey(num1)) {
					System.out.println("Comman Elements " + num1);
					
					map.remove(map);
				}
				
				
			}
			
		}
		
	}

}
