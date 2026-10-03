package collocation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main_3 {

    public static void main(String[] args) {

        List<Employees> Employee = new ArrayList<>();

        Employee.add(new Employees(1, "Ravi", "IT", 500000));
        Employee.add(new Employees(2, "Kiran", "Hr", 60000));
        Employee.add(new Employees(3, "Suresh", "IT", 700000));
        Employee.add(new Employees(4, "Arun", "Hr", 80000));

        Employee.sort(
            Comparator.comparing((Employees e) -> e.Department)
                      .thenComparing(
                          Comparator.comparingDouble((Employees e) -> e.Salary)
                                    .reversed()
                      )
        );

        System.out.println("Employee After Sorting");

        for (Employees e : Employee) {
            System.out.println(e);
        }
    }
}