package collectionProject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergetwoMap {

    // 16. Merge two Maps by adding values for shared keys.

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();

        map1.put("java", 10);
        map1.put("python", 20);
        map1.put("sql", 15);

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("java", 30);
        map2.put("python", 40);
        map2.put("sql", 50);

        Map<String, Integer> result = Stream.concat(
                map1.entrySet().stream(),
                map2.entrySet().stream()
        )
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                Integer::sum
        ));

        System.out.println(result);
    }
}