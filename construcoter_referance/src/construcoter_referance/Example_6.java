package construcoter_referance;

import java.util.function.BiFunction;

class Employee6 {

    int id;
    String name;

    Employee6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee id " + id);
        System.out.println("Employee Name " + name);
    }
}

public class Example_6 {

    public static void main(String[] args) {

        BiFunction<Integer, String, Employee6> bf = Employee6::new;

        Employee6 emp = bf.apply(105, "Maruthi");

        emp.display();
    }
}