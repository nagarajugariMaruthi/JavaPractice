package construcoter_referance;

import java.util.function.Function;

class EmployeeName {

    String name;

    EmployeeName(String name) {
        this.name = name;
        System.out.println("name = " + name);
    }
}

// 5. Create Student object using Function.
public class Example_5 {

    public static void main(String[] args) {

        Function<String, EmployeeName> function = EmployeeName::new;

        EmployeeName std = function.apply("Maruthi");
    }
}