package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;

public class Foreach_8 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "maruthi",
                "meghana gowda",
                "vamshi gowda",
                "manjula"
        );

        names.forEach(name -> System.out.println(name));
    }
}