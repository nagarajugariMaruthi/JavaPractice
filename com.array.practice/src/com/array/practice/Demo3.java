package com.array.practice;
import java.util.*;
public class Demo3 {
 
	static class pair {
		int value;
		int index;
		
		pair(int value, int index) {
			this.value = value;
			this. index = index;
		}
	}
	private static final int[] Pair = null;
	private static String result;
	public static int minswaps(int[] arr) {
		int n = arr.length;
		// create pair array 
		pair[] pair = new pair[n];
		for(int i = 0; i < n; i ++) {
			pair[i] = new pair(arr[i],i);
		}
		// sort baked value
		
		int value;
		  Arrays.sort(pair, (a, b) -> a.value - b.value);
		
		// visitted array
		
		boolean [] visited = new boolean [n];
		int swap = 0;
		// find cycles
		
		for(int i = 0; i < n; i++) {
			
			// alreday visited current position 
			if(visited[i] || pair[i].index == i) {
				continue;
			}
			int cyclesize = 0;
			int j = i;
			while(!visited[j]) {
				visited[j] = true;
				j = pair[j].index;
				cyclesize++;
				
				// cycle if size k = i swaps
				
				swap +=(cyclesize - i);
			}
		}
			return swap;
	}
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int resert = minswaps(arr);
	

		System.out.println("minimum swap3 regarding"+result);
	}
}
