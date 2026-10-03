
package com.loops.foreach;

import java.util.HashMap;
import java.util.Map;

public class topfrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 3};

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maximumElements = 0;
        int maximumFrequency = 0;

        // Find maximum frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maximumFrequency) {

                maximumFrequency = entry.getValue();
                maximumElements = entry.getKey();
            }
        }

        System.out.println("Top Frequency Element: " + maximumElements);
        System.out.println("Frequency: " + maximumFrequency);
    }
}
