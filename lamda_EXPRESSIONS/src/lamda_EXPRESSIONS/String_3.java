package lamda_EXPRESSIONS;

import java.util.Arrays;

public class String_3 {

    // 3. Find first repeated character.
    public static void main(String[] args) {

        String str = "Programming";

        String result = Arrays.stream(str.split(""))
                .filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch))
                .findFirst()
                .get();

        System.out.println("First Repeated Character: " + result);
    }
}