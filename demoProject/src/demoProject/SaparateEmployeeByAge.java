
package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class AgeEmployee {

    private int id;
    private String name;
    private int age;

    AgeEmployee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    @Override
    public String toString() {
        return "AgeEmployee [id=" + id
                + ", name=" + name
                + ", age=" + age + "]";
    }
}

public class SaparateEmployeeByAge {

    // 14. Separate employees aged 25 or younger from those older than 25.

    public static void main(String[] args) {

        List<AgeEmployee> Employee = Arrays.asList(
            new AgeEmployee(11, "maruthi", 22),
            new AgeEmployee(12, "dhanvitha", 19),
            new AgeEmployee(13, "nagaraju", 28),
            new AgeEmployee(14, "nagarathana", 30),
            new AgeEmployee(15, "vamshi gowda", 33)
        );

        Map<Boolean, List<AgeEmployee>> result = Employee.stream()
            .collect(Collectors.partitioningBy(
                employee -> employee.getage() <= 25
            ));

        System.out.println(
            "Employees aged 25 years or younger: " + result.get(true)
        );

        System.out.println(
            "Employees older than 25 years: " + result.get(false)
        );
    }
}