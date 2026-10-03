package construcoter_referance;

import java.util.function.BiFunction;

class Employee7 {

    int id;
    String name;

    Employee7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee id " + id);
        System.out.println("Employee Name " + name);
    }
}

public class Example_7 {

    public static void main(String[] args) {

        BiFunction<Integer, String, Employee7> bf = Employee7::new;

        Employee7 emp = bf.apply(105, "Maruthi");

        emp.display();
    }
}