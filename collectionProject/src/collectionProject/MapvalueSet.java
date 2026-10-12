package collectionProject;

import java.util.*;

public class MapvalueSet {

    // 2. Convert Map values into a Set.

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "maruthi");
        map.put(2, "dhanvitha");
        map.put(3, "siddu");

        Set<String> set = new HashSet<>(map.values());

        System.out.println(set);
    }
}