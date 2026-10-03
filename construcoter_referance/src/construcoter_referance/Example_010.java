package construcoter_referance;

import java.util.Arrays;
import java.util.List;

public class Example_010 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        list.stream()
            .filter(x -> x > 20)
            .forEach(x -> System.out.println(x));
    }
}