package demoProject;

import java.util.*;
import java.util.stream.Collectors;
  public class Example {

    public static void main(String[] args) {

        List<Staff> employees = Arrays.asList(
                new Staff("Maruthi", "IT", 60000),
                new Staff("Dhanvitha", "HR", 50000),
                new Staff("Siddu", "IT", 80000),
                new Staff("Sony", "HR", 70000),
                new Staff("Vamshi", "Finance", 90000)
        );

        Map<String, Optional<Staff>> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Staff::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Staff::getSalary))
                ));

        result.forEach((department, staff) ->
                System.out.println(department + " : " + staff.get()));
    }
}

class Staff {

    private String name;
    private String department;
    private int salary;

    public Staff(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}
