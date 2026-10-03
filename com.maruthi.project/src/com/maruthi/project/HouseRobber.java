package com.maruthi.project;
public class HouseRobber {
	    public static int rob(int[] nums) {

	        // If no houses
	        if (nums.length == 0) {
	            return 0;
	        }

	        // If only one house
	        if (nums.length == 1) {
	            return nums[0];
	        }

	        int prev1 = 0; // max till previous house
	        int prev2 = 0; // max till house before previous

	        for (int num : nums) {

	            // Rob current OR skip current
	            int current = Math.max(prev1, prev2 + num);

	            // Update values
	            prev2 = prev1;
	            prev1 = current;
	        }

	        return prev1;
	    }

	    public static void main(String[] args) {

	        int[] nums = {2, 7, 9, 3, 1};

	        int result = rob(nums);

	        System.out.println("Maximum money robbed = " + result);
	    }
	}

