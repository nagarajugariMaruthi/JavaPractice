package collectionProject;

import java.util.*;

public class Calculatetotalaveragesalary {

    // 10. Calculate total and average salary.

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("maruthi", 5000);
        map.put("nagaraju", 4000);
        map.put("manjula", 6000);
        map.put("sashi", 7000);
        map.put("nagarathan", 9000);

        int totalSalary = map.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        double averageSalary = map.values()
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println("total salary : " + totalSalary);
        System.out.println("average salary : " + averageSalary);
    }
}