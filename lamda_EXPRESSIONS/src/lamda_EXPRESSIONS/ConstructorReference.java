package lamda_EXPRESSIONS;

import java.util.function.Supplier;

class Employee {

    Employee() {
        System.out.println("Employee object created");
    }
}

public class ConstructorReference {

    public static void main(String[] args) {

        Supplier<Employee> supplier = Employee::new;

        Employee emp = supplier.get();
    }
}