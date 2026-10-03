package java8Conceptsquestion;

import java.util.function.Function;

public class FunctionSquareNumber {

    public static void main(String[] args) {

        Function<Integer, Integer> square =
                num -> num * num;

        int result = square.apply(5);

        System.out.println("Square = " + result);
    }
}                 