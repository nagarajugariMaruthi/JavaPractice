package java8Conceptsquestion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeSalary {

    public static void main(String[] args) {

        List<StudentEmployee> Employee = Arrays.asList(

            new StudentEmployee(101, "Maruthi", "Java", 60000),
            new StudentEmployee(102, "Rahul", "Testing", 45000),
            new StudentEmployee(103, "Ravi", "Java", 55000),
            new StudentEmployee(104, "Kiran", "HR", 40000)
        );

        Consumer<StudentEmployee> printEmployee = employee -> {

            if (employee.getsalary() > 50000) {

                System.out.println(
                    employee.getid() + " " +
                    employee.getname() + " " +
                    employee.getDepartment() + " " +
                    employee.getsalary()
                );
            }
        };

        Employee.forEach(printEmployee);
    }
}