package construcoter_referance;

import java.util.function.Function;

class Studentss {

    int id;

    Studentss(int id) {
        this.id = id;
        System.out.println("Studentss " + id);
    }
}

public class Example_3 {

    public static void main(String[] args) {

        // One-argument constructor reference
        Function<Integer, Studentss> function = Studentss::new;

        // Create object
        Studentss student = function.apply(105);
    }
}