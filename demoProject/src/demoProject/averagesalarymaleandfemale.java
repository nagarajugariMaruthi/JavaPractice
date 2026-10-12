package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class averagemaleandfemale {

    private int id;
    private String name;
    private double salary;
    private String gender;

    public averagemaleandfemale(int id, String name, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public double getsalary() {
        return salary;
    }

    public String getgender() {
        return gender;
    }

    @Override
    public String toString() {
        return "averagemaleandfemale [id=" + id
                + ", name=" + name
                + ", salary=" + salary
                + ", gender=" + gender + "]";
    }
}

public class averagesalarymaleandfemale {

    // 11. What is the average salary of male and female employees?

    public static void main(String[] args) {

        List<averagemaleandfemale> Employee = Arrays.asList(
            new averagemaleandfemale(1, "maruthi", 5000, "Male"),
            new averagemaleandfemale(2, "dhanvitha", 6000, "Female"),
            new averagemaleandfemale(3, "nagarathan", 7000, "Female"),
            new averagemaleandfemale(4, "nagaraju", 9000, "Male"),
            new averagemaleandfemale(5, "vamshi gowda", 10000, "Male")
        );

        Map<String, Double> averageSalaryByGender =
                Employee.stream()
                    .collect(Collectors.groupingBy(
                        averagemaleandfemale::getgender,
                        Collectors.averagingDouble(
                            averagemaleandfemale::getsalary
                        )
                    ));

        System.out.println(averageSalaryByGender);
    }
}
