package com.loops.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateArray {

    public static void main(String[] args) {

        String str = "Programming";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters
        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters:");

        // Find duplicate characters
        for (Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(
                    entry.getKey() + " == " + entry.getValue()
                );
            }
        }
    }
}
