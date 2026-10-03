package lamda_EXPRESSIONS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapCollectors {

    // 5. Convert List into Map.
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "maruthi",
                "dhanvitha",
                "nagaraju",
                "manjula"
        );

        Map<Integer, String> map = names.stream()
                .collect(Collectors.toMap(
                        name -> name.length(),
                        name -> name,
                        (name1, name2) -> name1
                ));

        System.out.println(map);
    }
}