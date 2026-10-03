package com.maruthi.project;
import java.util.HashMap;
 public class towsum1 {
	    public static void main(String[] args) {
	        
	        int arr[] = {2,7,11,15};
	        var target = 9;
	        
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
	    for(int i = 0; i < arr.length; i++) {
	        
	        int complement = target = arr[i];
	        
	        if(map.containsKey(complement)) {
	    
	    System.out.println("indices: " +map.get(complement) + " " + i);
	    
	    return;
	        }
	        
	        map.put(arr[i],i);
	    }
	    System.out.println("no solution found");
	    }
 }
	

	    
