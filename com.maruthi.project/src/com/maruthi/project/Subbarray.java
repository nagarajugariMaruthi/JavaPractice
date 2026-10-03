package com.maruthi.project;
import java.util.HashMap;
public class Subbarray {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Base case
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            // Check if (sum - k) exists
            if (map.containsKey(sum - k)) {

                count += map.get(sum - k);
            }

            // Store prefix sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};

        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println("Total Subarrays = " + result);
    }
}
