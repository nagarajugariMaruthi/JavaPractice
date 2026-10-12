
package demoProject;

import java.util.Arrays;
import java.util.List;

public class CountwithStringwithA {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Apple", "Banana", "avacade", "mango"
        );

        long count = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("count : " + count);
    }
}
