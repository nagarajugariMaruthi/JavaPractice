package lamda_EXPRESSIONS;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    // 3. Sort Map based on values.

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "maruthi");
        map.put(2, "dhanvith");
        map.put(3, "nagaraju");
        map.put(4, "manjula");
        map.put(5, "vannuer swamy");

        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByValue())
           .forEach(entry ->
               System.out.println(entry.getKey() + " " + entry.getValue())
           );
    }
}