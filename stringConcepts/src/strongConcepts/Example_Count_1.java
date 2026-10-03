package strongConcepts;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Example_Count_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Frequency:");

        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        sc.close();
    }
}