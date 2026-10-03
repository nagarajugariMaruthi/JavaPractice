
package javaInterviewQueation;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("is Anagram");
        } else {
            System.out.println("is not Anagram");
        }
    }

    public static boolean isAnagram(String str1, String str2) {

        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // Count characters from str1
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Compare with str2
        for (char ch : str2.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
}
