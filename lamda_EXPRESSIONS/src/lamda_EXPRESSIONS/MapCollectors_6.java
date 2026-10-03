package lamda_EXPRESSIONS;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;

public class MapCollectors_6 {

    // 6. Convert Map keys into List.
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "maruthi");
        map.put(2, "dhanvitha");
        map.put(3, "swamy");
        map.put(4, "nagaraju");
        map.put(5, "manjula");

        List<Integer> keys = map.keySet()
                .stream()
                .collect(Collectors.toList());

        System.out.println(keys);
    }
}