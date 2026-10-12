package collectionProject;

import java.util.*;

public class Employesalary {

    // 3. Filter employees whose salary is greater than 50000.

    public static void main(String[] args) {

        Map<String, Integer> employee = new HashMap<>();

        employee.put("maruthi", 50000);
        employee.put("dhanvitha", 700000);
        employee.put("vamshi gowda", 80000);
        employee.put("siddu", 90000);
        employee.put("sony", 100000);

        employee.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 50000)
                .forEach(entry -> System.out.println(
                        entry.getKey() + " : " + entry.getValue()));
    }
}