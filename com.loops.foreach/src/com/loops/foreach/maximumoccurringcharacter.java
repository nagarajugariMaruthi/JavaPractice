package com.loops.foreach;

import java.util.HashMap;
import java.util.Map;

public class maximumoccurringcharacter {

    public static void main(String[] args) {

        String str = "Programming";

        Map<Character, Integer> map = new HashMap<>();

        // Count character frequency
        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char charMaximum = ' ';
        int maxCount = 0;

        // Find maximum occurring character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxCount) {

                maxCount = entry.getValue();
                charMaximum = entry.getKey();
            }
        }

        System.out.println("Maximum occurring character: " + charMaximum);
        System.out.println("Frequency: " + maxCount);
    }
}