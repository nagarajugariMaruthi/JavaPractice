package com.maruthi.project;

	import java.util.HashMap;

	public class SubarraySumEquals {
	       
	    public static int subarraySum(int[] nums, int k ) {
	        
	        // store prefix sum and frequency 
	        
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
	    // Base case
	    map.put(0,1);
	    
	    int sum = 0; 
	    int count = 0;
	    
	    for(int num  : nums) {
	        
	        // add current element
	        sum += num;
	        
	        // check if(sum - k ) exits
	        if(map.containsKey(sum - k)) {
	            
	            count += map.get(sum -k);
	                
	            }
	            
	            // store current prefix sum 
	    map.put(sum, map.getOrDefault(sum, 0) +1);
	        }
	        
	        return count;
	        
	    }
	    public static void main(String[] args) {
	        
	        int[] nums = {1,2,3};
	        
	        int k = 3;
	        
	        int result = subarraySum(nums, k);
	        
	        System.out.println("total subarray = "+ result);
	    }
	    }