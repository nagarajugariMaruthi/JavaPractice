package collocation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Maruthi", 50000));
        employees.add(new Employee(102, "Dhanvith", 70000));
        employees.add(new Employee(105, "Nagarathan", 80000));

        System.out.println("Before Sorting:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees);

        System.out.println("\nAfter Sorting:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}