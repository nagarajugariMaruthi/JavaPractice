package com.loops.foreach;

import java.util.HashMap;
import java.util.Map;

public class frequencyofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50,50,50,60};
		
		Map<Integer , Integer> map = new  HashMap<>();
		
		for(int num : arr) {
			
			map.put(num, map.getOrDefault(num, 0) +1);  
			}
			
			System.out.println(map);
			}
		}
		
	