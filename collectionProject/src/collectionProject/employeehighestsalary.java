package collectionProject;

import java.util.*;

public class employeehighestsalary {

    // 7. Find every employee tied for the highest salary.

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(5000, "maruthi");
        map.put(4000, "dhanvitha");
        map.put(5000, "nagaraju");
        map.put(8000, "nagarathan");

        int highestSalary = map.keySet()
                .stream()
                .max(Integer::compare)
                .get();

        map.entrySet()
                .stream()
                .filter(entry -> entry.getKey() == highestSalary)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}