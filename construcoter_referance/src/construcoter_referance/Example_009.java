package construcoter_referance;

import java.util.Arrays;
import java.util.List;

public class Example_009 {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(105, "Maruthi", 50000),
                new Employee(110, "Dhanvitha", 60000),
                new Employee(115, "Nagaraju", 80000)
        );

        list.forEach(x -> System.out.println(x.name));
    }
}

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}