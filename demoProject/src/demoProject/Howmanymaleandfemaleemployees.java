package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class maruthi {

    private int id;
    private String name;
    private String gender;

    public maruthi(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name
                + ", gender=" + gender + "]";
    }
}

public class Howmanymaleandfemaleemployees {

    // 1. How many male and female employees are there in the organization?

    public static void main(String[] args) {

        List<maruthi> employees = Arrays.asList(
                new maruthi(1, "maruthi", "male"),
                new maruthi(2, "dhanvitha", "female"),
                new maruthi(3, "nagaraju", "male"),
                new maruthi(4, "manjula", "female"),
                new maruthi(5, "sony", "female")
        );

        Map<String, Long> result = employees.stream()
                .collect(Collectors.groupingBy(
                        maruthi::getGender,
                        Collectors.counting()
                ));

        System.out.println("Employee count by gender: " + result);
    }
}

