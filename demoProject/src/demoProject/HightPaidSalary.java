
package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;

class PaidSalary {

    private int id;
    private String name;
    private String department;
    private double salary;

    public PaidSalary(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "PaidSalary [id=" + id
                + ", name=" + name
                + ", department=" + department
                + ", salary=" + salary + "]";
    }
}

public class HightPaidSalary {

    // 4. Get the details of the highest-paid employee.

    public static void main(String[] args) {

        List<PaidSalary> employees = Arrays.asList(
                new PaidSalary(1, "maruthi", "IT Engineer", 30000),
                new PaidSalary(2, "nagaraju", "Marketing head", 400000),
                new PaidSalary(3, "nagarathan", "HR", 20000),
                new PaidSalary(4, "Vamshi gowda", "Finance", 60000),
                new PaidSalary(5, "Sunil gowda", "Sales Manager", 90000)
        );

        Optional<PaidSalary> result = employees.stream()
                .max(Comparator.comparingDouble(PaidSalary::getSalary));

        result.ifPresent(System.out::println);
    }
}
