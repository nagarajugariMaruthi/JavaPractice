package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestFrequency {

    public static void main(String[] args) {

        // 8. Second Highest Frequency

        String str = "Programming";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int FirstHight = 0;
        int SecondHight = 0;

        // Find highest and second highest
        for (int frequaency : map.values()) {

            if (frequaency > FirstHight) {

                SecondHight = FirstHight;
                FirstHight = frequaency;

            } else if (frequaency > SecondHight && frequaency < FirstHight) {

                SecondHight = frequaency;
            }
        }

        // Find character
        for (char ch : str.toCharArray()) {

            if (map.get(ch) == SecondHight) {

                System.out.println("Second Highest Frequency Character: " + ch);
                System.out.println("Second Highest Frequency: " + SecondHight);
                break;
            }
        }
    }
}