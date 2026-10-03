package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class LowestFrequencyElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 40, 30};

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int LowestFrequency = Integer.MAX_VALUE;
        int lowestElements = 0;

        // Find lowest frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() < LowestFrequency) {

                LowestFrequency = entry.getValue();
                lowestElements = entry.getKey();
            }
        }

        System.out.println("Lowest Frequency Element: " + lowestElements);
        System.out.println("Frequency: " + LowestFrequency);
    }
}