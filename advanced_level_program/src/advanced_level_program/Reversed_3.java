package advanced_level_program;

public class Reversed_3 {

    public static void main(String[] args) {

        long num = 6300136687L;

        long result = 0;

        while (num != 0) {

            long digit = num % 10;

            result = result * 10 + digit;

            num = num / 10;
        }

        System.out.println("Reversed: " + result);
    }
}