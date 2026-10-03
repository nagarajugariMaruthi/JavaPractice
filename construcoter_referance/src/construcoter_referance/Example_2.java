package construcoter_referance;

import java.util.function.Supplier;

class Students {

    Students() {
        System.out.println("Student Object created");
    }
}

public class Example_2 {

    public static void main(String[] args) {

        // No-argument constructor reference
        Supplier<Students> supplier = Students::new;

        // Create object
        Students student = supplier.get();
        
    
    }
}