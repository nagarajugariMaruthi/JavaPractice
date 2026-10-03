package com.maruthi.project;

public class MaximumBitwiseOR {

    public static long maximumOr(int[] nums, int k) {

        int n = nums.length;

        long[] prefix = new long[n];
        long[] suffix = new long[n];

        // Prefix OR
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] | nums[i];
        }

        // Suffix OR
        suffix[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] | nums[i];
        }

        long max = 0;

        for (int i = 0; i < n; i++) {

            long left = (i == 0) ? 0 : prefix[i - 1];

            long right = (i == n - 1) ? 0 : suffix[i + 1];

            // Double current element k times
            long current = ((long) nums[i] << k);

            long totalOR = left | current | right;

            max = Math.max(max, totalOR);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {12, 9};
        int k = 1;

        long result = maximumOr(nums, k);

        System.out.println("Maximum Bitwise OR: " + result);
    }
}