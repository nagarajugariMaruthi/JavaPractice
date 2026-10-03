package construcoter_referance;

import java.util.function.Function;

class department {

    String name;

    department(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("name = " + name);
    }
}

public class Example_10 {

    public static void main(String[] args) {

        // Lambda
        Function<String, department> lambda =
                name -> new department(name);

        department department1 = lambda.apply("maruthi");

        // Constructor Reference
        Function<String, department> reference =
                department::new;

        department department2 = reference.apply("dhanvitha");

        department1.display();
        department2.display();
    }
}