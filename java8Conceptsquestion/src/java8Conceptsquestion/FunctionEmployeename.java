package java8Conceptsquestion;

import java.util.function.Function;

public class FunctionEmployeename {

    public static void main(String[] args) {

        Employeee employeee = new Employeee(105, "Maruthi");

        Function<Employeee, String> employeeeName =
                emp -> emp.name;

        String result = employeeeName.apply(employeee);

        System.out.println("Employee Name = " + result);
    }
}