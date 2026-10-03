package com.loops.foreach;

import java.util.HashSet;
import java.util.Set;

public class Findduplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find duplicate elements in an array.
		
		int[] arr = {10,20,30,50,30,40,60};
		
		Set<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			
			if(!set.add(num)) {
				
				System.out.println("Duplicate Elements : " + num);
				
			}
		}

	}

}
