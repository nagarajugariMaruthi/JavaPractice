package com.maruthi.project;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        // Sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // First interval
        int[] current = intervals[0];

        result.add(current);

        for (int[] interval : intervals) {

            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            // Overlapping intervals
            if (nextStart <= currentEnd) {

                current[1] = Math.max(currentEnd, nextEnd);

            } else {

                current = interval;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] merged = merge(intervals);

        System.out.println("Merged Intervals:");

        for (int[] interval : merged) {

            System.out.println(
                    "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}