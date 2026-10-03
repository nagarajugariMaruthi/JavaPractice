package advanced_level_program;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoRepetitiveCharacter {

    public static void main(String[] args) {

        String str = "maruthii";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println("First non-repetitive character: " + entry.getKey());
                break;
            }
        }
    }
}