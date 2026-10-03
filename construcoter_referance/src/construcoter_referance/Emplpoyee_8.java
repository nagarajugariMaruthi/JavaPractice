package construcoter_referance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// 8. Create multiple objects from List<String> using Constructor Reference

class Example {

    String name;

    Example(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name = " + name);
    }
}

public class Emplpoyee_8 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "maruthi",
                "dhanvitha",
                "sunil",
                "sony",
                "nagaraju"
        );

        Function<String, Example> function = Example::new;

        names.stream()
             .map(function)
             .forEach(Example::display);
    }
}