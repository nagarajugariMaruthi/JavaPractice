package construcoter_referance;

import java.util.Arrays;
import java.util.List;

public class Example_003 {

    // 3. Print only even numbers using forEach()

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 35, 40, 55, 65, 80, 90);

        list.forEach(x -> {

            if (x % 2 == 0) {
                System.out.println(x);
            }

        });
    }
}