package com.maruthi.project;

import java.util.HashMap;

public class TwoSumtestecases {
    
    private static int[] num;

	public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            int complement = target - nums[i];
            
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{-1, -1};
    }
    
public static void runtest(int[] nums, int target) {
    
    int[] result = twoSum(num, target);
    
    System.out.println("Array: ");
    
    for(int num : nums) {
        System.out.println(num + "");
    }
    
    System.out.println("\ntarget: "+target);
    
    System.out.println("output indices: ["+ result[0]+ "," + result[1] + "]");
    
    System.out.println("-------------------------------------");
}

public static void main(String[] args) {
    
    // test case 1
    runtest(new int[]{2,7,11,15},9);
    
    // teste case 2
    runtest(new int[]{3,2,4},6);
    
    // teste case 3
    runtest(new int[]{3,3},6);
    
    // teste case 4 
    runtest(new int[]{1,5,3,7}, 8);
    
    // teste case 5
    runtest(new int[]{0,4,3,0}, 0);
    
    // teste case 6
    runtest(new int[]{10,20,30,40},70);
    
    // test case 7
    runtest(new int[]{10,20,30,40},70);
    
    // teste case 8
    runtest(new int[]{1,2,3,4,5},10);
    
    // test case 9
    runtest(new int[]{5,5,5,5},10);
    
    // teste case 10
    runtest(new int[] {100,200,300,400},500);
    
    // teste case 11
    runtest(new int[]{8,1,6,2,9},10);
    
    // test case 12
    runtest(new int[] {7,14,21,28},35);
}
}