package collectionProject;

import java.util.*;

public class SortedByvalue {

    // 5. Sort a Map by values in descending order.

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Maruthi", 50000);
        map.put("Dhanvitha", 70000);
        map.put("Siddu", 90000);
        map.put("Sony", 60000);
        map.put("Vamshi", 80000);

        map.entrySet()
           .stream()
           .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
           .forEach(entry ->
               System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}