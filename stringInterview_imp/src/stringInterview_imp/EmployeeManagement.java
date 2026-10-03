package stringInterview_imp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeManagement {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "MARUTHI", "Java", 50000));
        employees.add(new Employee(102, "Dhanvitha", "Python", 60000));
        employees.add(new Employee(103, "Sashi", "Manual Testing", 40000));
        employees.add(new Employee(104, "Sony", "C++", 80000));
        employees.add(new Employee(105, "Nagarathan", "Embedded Developer", 90000));

        // Display all Employees
        System.out.println("All Employees:");

        employees.forEach(System.out::println);

        // Display Java Employees
        System.out.println("\nJava Department:");

        employees.stream()
                .filter(e -> e.getdepartment().equals("Java"))
                .forEach(System.out::println);

        // Highest Salary
        Optional<Employee> highestSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        System.out.println("\nHighest Salary:");

        highestSalary.ifPresent(System.out::println);

        // Employees Sorted by Salary
        System.out.println("\nEmployees Sorted by Salary:");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        // Count Employees by Department
        System.out.println("\nDepartment Count:");

        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingByConcurrent(
                        Employee::getdepartment,
                        Collectors.counting()
                ));

        System.out.println(departmentCount);
    }
}