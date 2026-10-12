
package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Averagemaleandfemale {

    private int id;
    private String name;
    private String gender;
    private int age;

    public Averagemaleandfemale(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}

public class Averagebygender {

    // 3. What is the average age of male and female employees?

    public static void main(String[] args) {

        List<Averagemaleandfemale> employees = Arrays.asList(
                new Averagemaleandfemale(1, "maruthi", "Male", 26),
                new Averagemaleandfemale(2, "dhanvitha", "Female", 24),
                new Averagemaleandfemale(3, "nagarathan", "Female", 28),
                new Averagemaleandfemale(4, "sidhartha reddy", "Male", 27),
                new Averagemaleandfemale(5, "vamshi gowda", "Male", 25)
        );

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Averagemaleandfemale::getGender,
                        Collectors.averagingInt(Averagemaleandfemale::getAge)
                ));

        System.out.println("Average age by gender: " + result);
    }
}
